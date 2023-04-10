package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Quadrilateral() {
    }

    public double getLength(){
        return this.length;
    }
    abstract double setLength(double length);
    abstract double setWidth(double width);
    public double getWidth(){
        return this.width;
    }
}
