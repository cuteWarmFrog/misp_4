package com.company.command;

public class ExitCommand implements ICommand {

    public ExitCommand() {
    }

    @Override
    public void execute() {
        System.out.println("Пока!");
        System.exit(0);
    }
}
