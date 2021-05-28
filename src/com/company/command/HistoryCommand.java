package com.company.command;

import com.company.point.History;
import com.company.point.Point;

import java.util.List;

public class HistoryCommand implements ICommand {

    public HistoryCommand() {
    }

    @Override
    public void execute() {
        List<Point> points = History.getShotsHistory();
        System.out.println("Всего выстрелов: " + points.size());
        for (Point point : points) {
            System.out.println(point);
        }
    }
}
