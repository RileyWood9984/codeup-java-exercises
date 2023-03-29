import java.util.Scanner;
public class MethodExercises {
    public static int Addition(int x,int y){
        return x+y;
    }
    public static int Subtraction(int x,int y){
        return x-y;
    }
    public static int Multiplication(int x,int y){
        return x*y;
    }
    public static int Division(int x,int y){
        return x/y;
    }
    public static int Modulus(int x,int y){
        return x%y;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ",min,max);
        int userInput = scanner.nextInt();
        if(userInput <=max&&userInput>=min){
            System.out.printf("Yup, %s, is between 1 and 20 nice job.%n",userInput);
            getFactorial(userInput);
            return (userInput);
        } else{
            System.out.printf("Wow, %s really isn't what I ask for try again.%n",userInput);
            return getInteger(min,max);
        }
    }
    public static int getFactorial(int x){
        long fact=1;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Would you like to see the factorial of %s?%nY/N?%n",x);
        String yeNa = scanner.next();
        if (yeNa.equalsIgnoreCase("y")){
            System.out.printf("%s!= ",x);
            for(int i = 1;i <= x;i++) {
                fact*=i;
                System.out.printf("%s",i);
                if(x>1&&i!=x){
                    System.out.print("*");

                } else{
                    System.out.printf(" =%s%n",fact);
                    System.out.println("Would you like to see another?Y/N?");
                    yeNa = scanner.next();
                    if (yeNa.equalsIgnoreCase("y")){
                        getInteger(1,20);
                    }else{
                        break;
                    }
                    }
            }
        } else if (yeNa.equalsIgnoreCase("n")){

        } else {
            getFactorial(x);
        }
        return x;
    }
    public static void roll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of sides on your dice:");
        int numberOfSides = scanner.nextInt();
        int first = (int) (Math.random() * numberOfSides) + 1;
        int second = (int) (Math.random() * numberOfSides) + 1;
        System.out.printf("%d was your first roll\n%d was your second roll.", first, second);
        System.out.println("Roll again?");
        rollAgain();
    }
public static void rollAgain(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Y/N?");
    String yeNa = scanner.next();
    if (yeNa.equalsIgnoreCase("y")){
        roll();
    } else if (yeNa.equalsIgnoreCase("n")) {
    } else {
        rollAgain();
    }

}
    public static void main(String[] args){
        System.out.println(Addition(12,6));
        System.out.println(Subtraction(12,6));
        System.out.println(Multiplication(12,6));
        System.out.println(Division(12,6));
        System.out.println(Modulus(12,6));
        getInteger(1,20);
        roll();
    }
}
