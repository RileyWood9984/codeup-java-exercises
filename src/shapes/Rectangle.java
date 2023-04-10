package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double setLength(double length) {
        this.length=length;
        return length;
    }

    @Override
    double setWidth(double width) {
        this.width=width;
        return width;
    }

    public double getArea() {
        return (this.length * this.width);
    }
    public double getPerimeter(){
        return ((this.length*2)+(this.width*2));
    }
}
