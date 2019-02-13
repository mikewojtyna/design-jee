package pro.buildmysoftware.oop.controller;

import java.util.Objects;

class Command {
	private String action;
	private int value;

	public Command(String action, int value) {
		this.action = action;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Command command = (Command) o;
		return value == command.value && Objects
			.equals(action, command.action);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, value);
	}

	@Override
	public String toString() {
		return "Command{" + "action='" + action + '\'' + ", value=" + value + '}';
	}
}
