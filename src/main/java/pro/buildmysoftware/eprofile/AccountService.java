package pro.buildmysoftware.eprofile;

import java.util.Optional;

public interface AccountService {
	Optional<Account> createAccount(FormData formData);
}
