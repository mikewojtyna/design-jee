package pro.buildmysoftware.oop.controller;

import java.io.InputStream;
import java.util.Scanner;

class CliController {

	private CommandExecutor commandExecutor;

	public CliController(CommandExecutor commandExecutor) {
		this.commandExecutor = commandExecutor;
	}

	void handle(InputStream source) {
		System.out.println("Enter command: <action> <value>");
		try (Scanner scanner = new Scanner(source)) {
			scanner.useDelimiter("\n");
			String commandAsString = scanner.next();
			String[] commandArgs = commandAsString.split(" ");
			Command parsedCommand = new Command(commandArgs[0],
				Integer
				.parseInt(commandArgs[1]));
			commandExecutor.executeCommand(parsedCommand);
		}
	}
}
