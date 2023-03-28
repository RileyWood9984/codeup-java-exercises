import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasResponded = false;
        System.out.println("Type something to Bob:");
        do {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
                hasResponded = true;
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                hasResponded = true;
            } else if(userInput.equals("")){
                System.out.println("Fine be that way!");
                hasResponded = true;
            } else {
                System.out.println("Whatever.");
                hasResponded = true;
            }
        } while (hasResponded);
            hasResponded = false;
    }
}
