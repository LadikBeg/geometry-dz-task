package geometry3DCalculator;

public class TetrahedronVolume {
    private double aX;
    private double aY;
    private double aZ;
    private double bX;
    private double bY;
    private double bZ;
    private double cX;
    private double cY;
    private double cZ;

    public TetrahedronVolume(double aX, double aY, double aZ, double bX, double bY, double bZ, double cX, double cY, double cZ) {
        this.aX = aX;
        this.aY = aY;
        this.aZ = aZ;
        this.bX = bX;
        this.bY = bY;
        this.bZ = bZ;
        this.cX = cX;
        this.cY = cY;
        this.cZ = cZ;
    }

    public double getTetrahedronVolume() {
        double v = (aX * (bY * cZ - bZ * cY) - bX * (aY * cZ - aZ * cY) + cX * (aY * bZ - aZ * bY)) / 6.0;
        if (v < 0) {
            v *= -1;
        }
        return v;
    }

    public double getaX() {
        return aX;
    }

    public void setaX(double aX) {
        this.aX = aX;
    }

    public double getaY() {
        return aY;
    }

    public void setaY(double aY) {
        this.aY = aY;
    }

    public double getaZ() {
        return aZ;
    }

    public void setaZ(double aZ) {
        this.aZ = aZ;
    }

    public double getbX() {
        return bX;
    }

    public void setbX(double bX) {
        this.bX = bX;
    }

    public double getbY() {
        return bY;
    }

    public void setbY(double bY) {
        this.bY = bY;
    }

    public double getbZ() {
        return bZ;
    }

    public void setbZ(double bZ) {
        this.bZ = bZ;
    }

    public double getcX() {
        return cX;
    }

    public void setcX(double cX) {
        this.cX = cX;
    }

    public double getcY() {
        return cY;
    }

    public void setcY(double cY) {
        this.cY = cY;
    }

    public double getcZ() {
        return cZ;
    }

    public void setcZ(double cZ) {
        this.cZ = cZ;
    }
}
