package com.company.command;

public class HelpCommand implements ICommand {
    public HelpCommand() {
    }

    @Override
    public void execute() {
        System.out.println("help command");
    }
}
