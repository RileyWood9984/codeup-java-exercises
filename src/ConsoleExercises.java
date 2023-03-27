import java.text.ParseException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);
        System.out.print("Enter three words: ");
        String usertext1 = scanner.next();
        String usertext2 = scanner.next();
        String usertext3 = scanner.next();
        System.out.println(usertext1);
        System.out.println(usertext2);
        System.out.println(usertext3);
        System.out.print("Enter a sentence:");
        String uS =scanner.next();
        String userSent = scanner.nextLine();
        System.out.print(uS);
        System.out.println(userSent);
        System.out.print("Enter the length of the classroom:");
        String userLength = scanner.nextLine();
        System.out.printf("Enter the width of the classroom:");
        String userWidth = scanner.nextLine();
        int userPeri = parseInt(userLength)+parseInt(userLength)+parseInt(userWidth)+parseInt(userWidth);
        int userArea = parseInt(userLength)*parseInt(userWidth);
        System.out.printf("The perimeter is %s",userPeri);
        System.out.printf("%nThe area is %s",userArea);


    }
}
