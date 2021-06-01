package invoker;

import command.*;

import java.util.Map;
import java.util.TreeMap;

public class Invoker {
    private final Map<String, ICommand> commands;

    public Invoker() {
//        ExitCommand exitCommand = new ExitCommand();
//        HelpCommand helpCommand = new HelpCommand();
//        HistoryCommand historyCommand = new HistoryCommand();
//        ShotCommand shotCommand = new ShotCommand();

        commands = new TreeMap<>();
        commands.put("help", new HelpCommand());
        commands.put("history", new HistoryCommand());
        commands.put("exit", new ExitCommand());
        commands.put("shot", new ShotCommand());
    }

    public boolean invoke(String userCommand) {
        ICommand command = commands.get(userCommand);

        if (command != null) {
            command.execute();
            return true;
        }
        return false;
    }

}
