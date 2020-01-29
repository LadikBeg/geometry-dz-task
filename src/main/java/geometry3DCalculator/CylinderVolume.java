package geometry3DCalculator;

public class CylinderVolume {
    private double basis;
    private double height;

    public CylinderVolume(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }


    public double getCylinderVolume() {
        double volume = Math.PI * basis * basis * height;
        return volume;
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
