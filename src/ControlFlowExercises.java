
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to up to?");
        int userNum= scanner.nextInt();
        if (userNum > 1) {
            for (int i = 1; i <= userNum; i++) {
                int squared = i * i;
                int cubed = i * i * i;
                if (i == 1) {
                    System.out.println("Number | Squared | Cubed");
                    System.out.println("------ | ------- | -----");
                    System.out.println("1      | 1       | 1    ");
                } else {
                    System.out.printf("%s      | %s       | %s    %n", i, squared, cubed);

                }

            }

        }
    }

}
