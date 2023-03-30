package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean answer;
        int totalCircles=0;
        do {
            Input input = new Input();
            System.out.println("Please enter the radius of your circle.");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            double circumference = circle.getCircumference();
            double area = circle.getArea();
            System.out.printf("The circumference of your circle is %f, and the area is %f. %n", circumference, area);
            ++totalCircles;
            System.out.println("Would you like to make another circle? Yes or No?");
            answer = input.yesNo();
        } while (answer);
        System.out.printf("You made %d circles.",totalCircles);
    }
}
