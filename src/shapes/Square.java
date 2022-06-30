package shapes;

public class Square extends Quadrilateral {
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(){}

    public Square(double side){
        super(side, side);
    }

//    private double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("This is the Square method.");
//        return Math.pow(side, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("This is the Square method.");
//        return 4 * side;
//    }
}