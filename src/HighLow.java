import java.sql.SQLOutput;
import java.util.Scanner;
public class HighLow {
    public static void game(int x){
        int randomNum = (int) (Math.random()*100)+1;
        if (x!=randomNum){
            if(x>randomNum){
                System.out.println("LOWER");
            }else{
                System.out.println("HIGHER");
            }
            guessAgain(randomNum);
        }else{
            System.out.println("GOOD GUESS");
        }
    }
    public static void guessAgain(int rando){
        Scanner s = new Scanner(System.in);
        System.out.println("GUESS AGAIN.");
        int uNum = s.nextInt();
        if (uNum!=rando){
            if(uNum>rando){
                System.out.println("LOWER");
            }else{
                System.out.println("HIGHER");
            }
            guessAgain(rando);
        }else{
            System.out.println("GOOD GUESS");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("FIND THE NUMBER BETWEEN 1 AND 100!");
        int uNum = s.nextInt();
        game(uNum);
    }
}
