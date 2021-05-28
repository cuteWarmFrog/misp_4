package com.company.point;

public class Point {
    private double x, y, r;
    private boolean isHit;

    public Point(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public boolean isHit() {
        return isHit;
    }

    @Override
    public String toString() {
        String hit = isHit ? "Попав" : "Не попав";
        return "x= " + x +
                ", y= " + y +
                ", r= " + r +
                ",  " + hit;
    }
}
