package pro.buildmysoftware.eprofile;

import java.util.Objects;

public class Account {
	private String login;
	private String name;
	private String lastName;

	public Account(String login, String name, String lastName) {
		this.login = login;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Account{" + "login='" + login + '\'' + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Account account = (Account) o;
		return Objects.equals(login, account.login);
	}

	@Override
	public int hashCode() {
		return Objects.hash(login);
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLogin() {
		return login;
	}
}
