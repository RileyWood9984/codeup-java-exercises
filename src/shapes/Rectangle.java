package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width){
        super(length,width);
    }

    public void setLength(double length) {
        this.length=length;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getArea() {
        return (this.length * this.width);
    }
    public double getPerimeter(){
        return ((this.length*2)+(this.width*2));
    }
}
