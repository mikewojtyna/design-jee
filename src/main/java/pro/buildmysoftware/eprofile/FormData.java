package pro.buildmysoftware.eprofile;

import java.util.Objects;

public class FormData {
	private final String name;
	private String lastName;
	private String login;

	public FormData(String login, String name, String lastName) {
		this.login = login;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FormData{" + "name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", login='" + login + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormData formData = (FormData) o;
		return Objects.equals(name, formData.name) && Objects
			.equals(lastName, formData.lastName) && Objects
			.equals(login, formData.login);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, lastName, login);
	}

	public String getLogin() {
		return login;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
}
