package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return area = length * width;
        System.out.println("The area is: " + getArea());
    }

    public double getPerimeter() {
        return perimeter = 2 * length + 2 * width;
        System.out.println("The perimeter is: " + getPerimeter());
    }

}
