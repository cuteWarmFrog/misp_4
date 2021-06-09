package area;

public class AreaCounter implements AreaCounterMBean {

    private double generalArea;

    public void updateArea(double r) {
        double triangleArea = r * r / 2;
        double circleArea = (Math.PI * r * r) / 4;
        double rectangleArea = r * (r / 2);
        generalArea = triangleArea + circleArea + rectangleArea;
    }

    @Override
    public double getArea() {
        return generalArea;
    }
}
