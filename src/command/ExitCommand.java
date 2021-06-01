package command;

public class ExitCommand implements ICommand {

    public ExitCommand() {
    }

    @Override
    public void execute() {
        System.out.println("Good bye!");
        System.exit(0);
    }
}
