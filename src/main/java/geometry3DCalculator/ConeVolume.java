package geometry3DCalculator;

public class ConeVolume {
    private double rad;
    private double h;

    public ConeVolume(double rad, double h) {
        this.rad = rad;
        this.h = h;
    }

    public double getConeVolume() {
        double v = Math.PI * rad * rad * h / 3;
        return v;
    }


    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}

