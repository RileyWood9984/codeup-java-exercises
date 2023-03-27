
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade out of one hundred?");
        int userNum= scanner.nextInt();
        if (userNum <= 59) {
            System.out.println("That's an F.");
            } else if (userNum<=66) {
            System.out.println("A D is not that bad!");
        } else if(userNum<=79){
            System.out.println("A C is pretty good.");
        } else if(userNum<=87){
            System.out.println("A B is close to the best, nice!");
        }else {
            System.out.println("Well done on the A!");
        }
    }

}
