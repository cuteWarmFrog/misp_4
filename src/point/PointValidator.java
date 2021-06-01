package point;

import java.util.Arrays;
import java.util.List;

public class PointValidator {

    private final List<Double> xValidValues = Arrays.asList(-3.0, -2.0, -1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0);
    private final double yLeft = -3.0;
    private final double yRight = 5;
    private final List<Double> rValidValues = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

    public PointValidator() {
    }

    public boolean validatePoint(Point point) {
        return checkX(point.getX()) && checkY(point.getY()) && checkR(point.getR());
//        if(!isValid) {
//            throw new NumberFormatException();
//        }
    }

    private boolean checkX(double x) {
        if (!xValidValues.contains(x)) {
            System.out.println("X must be in range [-3, -2, -1, 0, 1, 2, 3, 4, 5]");
            return false;
        }
        return true;
    }

    private boolean checkY(double y) {
        if (y < -3 || y > 5) {
            System.out.println("Y must be between [-3, 5]");
            return false;
        }
        return true;
    }

    private boolean checkR(double r) {
        if (!rValidValues.contains(r)) {
            System.out.println("R must be in range [1, 2, 3, 4, 5]");
            return false;
        }
        return true;
    }
}
