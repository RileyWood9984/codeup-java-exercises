package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side,side);
    }

    public double getArea() {
        return Math.pow(this.length, 2) ;
    }

    public double getPerimeter() {
        return this.length*4;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;

    }
}

