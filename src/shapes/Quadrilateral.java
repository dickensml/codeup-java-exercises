
package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable {

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public Quadrilateral(){}

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
