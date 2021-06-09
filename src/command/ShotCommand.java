package command;

import area.AreaCounter;
import point.AreaChecker;
import point.Point;
import point.PointValidator;
import pointCounter.PointCounter;
import reader.ConsoleReader;

import javax.management.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;

public class ShotCommand implements ICommand {
    private final ConsoleReader consoleReader;
    private final PointValidator pointValidator;
    private final AreaChecker areaChecker;
    private final AreaCounter areaCounter;
    private final PointCounter pointCounter;

    public ShotCommand() throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        areaCounter = new AreaCounter();
        ObjectName name1 = new ObjectName("ru.itmo.Main:name=AreaCounter");
        mbs.registerMBean(areaCounter, name1);

        pointCounter = new PointCounter();
        ObjectName name2 = new ObjectName("ru.itmo.Main:name=PointCounter");
        mbs.registerMBean(pointCounter, name2);

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
                areaCounter.updateArea(r);
                pointCounter.update(History.getShotsHistory());
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
