package command;

import point.Point;

import java.util.List;

public class HistoryCommand implements ICommand {

    public HistoryCommand() {
    }

    @Override
    public void execute() {
        List<Point> points = History.getShotsHistory();
        System.out.println("All shots: " + points.size());
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
