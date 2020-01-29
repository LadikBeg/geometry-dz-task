package geometry2DCalculator;

public class ParallelogramArea {
    private double basis;
    private double height;

    public ParallelogramArea(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    public double getParallelogramArea() {
        double s = basis * height;
        return s;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
