package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String uInput = scanner.next();
        return (uInput.equalsIgnoreCase("yes")|| uInput.equalsIgnoreCase("y"));
    }

    int getInt(int min, int max){
        System.out.printf("Please enter a value between %d, and %d: %n",min,max);
        int uInput = scanner.nextInt();
        if(uInput<=max && uInput>=min) return uInput;
        else {
            return getInt(min,max);
        }
    }

    int getInt(){
        return scanner.nextInt();

    }

    double getDouble(double min, double max){
        System.out.printf("Please enter a decimal value between %f, and %f: %n",min,max);
        double uInput = scanner.nextDouble();
        if(uInput<=max && uInput>=min) return uInput;
        else {
            return getDouble(min,max);
        }
    }
    public double getDouble(){
        return scanner.nextDouble();
    }

}
