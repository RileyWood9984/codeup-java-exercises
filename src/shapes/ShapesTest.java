package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4,5);
        System.out.println("Rectangle");
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape= new Square(5);
        System.out.println("Square");
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
