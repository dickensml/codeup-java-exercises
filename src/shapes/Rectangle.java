package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    //    protected double length;
//    protected double width;
//
    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//
//    public double getArea(){
//        System.out.println("This is the Rectangle method");
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("This is the Rectangle method");
//        return 2 * length + 2 * width;
//    }
}
