package pro.buildmysoftware.eprofile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateAccountTest {

	private AccountService accountService;

	@BeforeEach
	void beforeEach() {
		accountService = new InMemoryAccountService();
	}

	// @formatter:off
	@DisplayName(
		"should create account using form data, " +
		"when account name is unique"
	)
	// @formatter:on
	@Test
	void test() throws Exception {
		// given
		FormData formData = formDataWithLoginNameAndLastName("login",
			"mike", "wojtyna");

		// when
		Account createdAccount = accountService.createAccount(formData)
			.get();

		// then
		assertThat(createdAccount.getLogin()).isEqualTo("login");
		assertThat(createdAccount.getName()).isEqualTo("mike");
		assertThat(createdAccount.getLastName()).isEqualTo("wojtyna");
	}

	// @formatter:off
	@DisplayName(
		"should not create new account, " +
		"when login in form data is not unique"
	)
	// @formatter:on
	@Test
	void test1() throws Exception {
		// given
		FormData formData = formDataWithLoginNameAndLastName("login",
			"mike", "wojtyna");
		accountService.createAccount(formData);
		FormData formDataWithTheSameLogin =
			formDataWithLoginNameAndLastName("login", "george",
				"martin");

		// when
		Optional<Account> optional = accountService
			.createAccount(formDataWithTheSameLogin);

		// then
		assertThat(optional).isNotPresent();
	}

	private FormData formDataWithLoginNameAndLastName(String login,
							  String name,
							  String lastName) {
		return new FormData(login, name, lastName);
	}
}
