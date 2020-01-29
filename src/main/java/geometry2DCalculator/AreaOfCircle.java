package geometry2DCalculator;

public class AreaOfCircle {
    private double radius;

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    public double getAreaOfCircle() {
        radius = radius * radius * Math.PI;
        return radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
