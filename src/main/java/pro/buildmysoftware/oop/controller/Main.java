package pro.buildmysoftware.oop.controller;

public class Main {
	public static void main(String[] args) {
		new CliController(command -> System.out
			.printf("Parsed " + "command: %s", command))
			.handle(System.in);
	}
}
