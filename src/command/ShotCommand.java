package command;

import point.AreaChecker;
import point.Point;
import point.PointValidator;
import reader.ConsoleReader;

import java.io.IOException;

public class ShotCommand implements ICommand {
    private final ConsoleReader consoleReader;
    private final PointValidator pointValidator;
    private final AreaChecker areaChecker;

    public ShotCommand() {
        consoleReader = new ConsoleReader();
        pointValidator = new PointValidator();
        areaChecker = new AreaChecker();
    }

    @Override
    public void execute() {
        System.out.println("Type X, Y, R with whitespace.\n" +
                "Please, don't crack me, friend!");
        System.out.print(">>> ");

        try {
            String input = consoleReader.read();
            String[] args = input.split(" ");

            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            double r = Double.parseDouble(args[2]);
            Point point = new Point(x, y, r);

            if (pointValidator.validatePoint(point)) {
                point.setHit(areaChecker.checkIfShotHitArea(point));
                History.addPoint(point);
                System.out.println("Point has been added successfully.");
            }

        } catch (IOException e) {
            System.out.println("Not good!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You type something... wrong.");
        }
    }
}
