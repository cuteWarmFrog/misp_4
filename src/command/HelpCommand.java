package command;

public class HelpCommand implements ICommand {
    public HelpCommand() {
    }

    @Override
    public void execute() {
        System.out.println("Help: prints this\n" +
                "Shot: does shot\n" +
                "History: prints shot history\n" +
                "Exit: exits the program");
    }
}
