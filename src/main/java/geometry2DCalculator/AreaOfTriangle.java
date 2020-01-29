package geometry2DCalculator;

import java.util.InputMismatchException;

public class AreaOfTriangle {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public AreaOfTriangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getAreaOfTriangle() {
        try {
            double p = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
            Math.sqrt(p * (p - getFirstSide()) * (p - getSecondSide()) * (p - getThirdSide()));
            return p;
        } catch (InputMismatchException e) {
            return e.hashCode();
        }

    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
}
