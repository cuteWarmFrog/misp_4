package com.company.point;

public class AreaChecker {

    public boolean checkIfShotHitArea(Point point) {
        double x = point.getX();
        double y = point.getY();
        double r = point.getR();
        return x <= 0 && x >= -r && y >= 0 && y <= r / 2 ||
                x >= 0 && y >= 0 && x * x + y * y <= r * r / 4 ||
                x <= 0 && y <= 0 && y >= -x - r;
    }
}
