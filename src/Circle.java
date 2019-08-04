public class Circle {
    private double radius= 1.0;
    private String color="blu";
    
    public Circle() {
    }


    public Circle( double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Hinh tron co ban kinh la " + this.radius + ((this.color.equalsIgnoreCase("")) ? " khong co mau" : " co mau " + this.color);
    }
    }


