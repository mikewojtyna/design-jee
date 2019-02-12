package pro.buildmysoftware.eprofile;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryAccountService implements AccountService {

	private Map<String, Account> accountMap;

	public InMemoryAccountService() {
		accountMap = new HashMap<>();
	}

	@Override
	public Optional<Account> createAccount(FormData formData) {
		if (accountMap.containsKey(formData.getLogin())) {
			return Optional.empty();
		}
		accountMap.put(formData.getLogin(), accountFromData(formData));
		return Optional.ofNullable(accountMap.get(formData.getLogin()));
	}

	private Account accountFromData(FormData formData) {
		return new Account(formData.getLogin(), formData
			.getName(), formData.getLastName());
	}
}
