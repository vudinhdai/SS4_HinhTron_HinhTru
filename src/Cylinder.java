public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;

    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolumetric() {
        return Math.PI * getArea() * height;


    }

    @Override
    public String toString() {
        return " Cylinder of chieu cao la  " + this.height + " va " + super.toString();
    }

}
