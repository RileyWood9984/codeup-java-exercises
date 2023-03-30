package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("Type something.");
        Input input = new Input();
        String myString = input.getString();
        System.out.printf("Wow... %s... What a silly thing do say. Do you think you ever said anything sillier? Yes or no?%n",myString);
        boolean myResponse = input.yesNo();
        System.out.printf("%sly, really? Interesting... Well anyways what is your favorite positive number?%n", myResponse);
        int myInt = input.getInt();
        System.out.printf("%s that's a nice number, but could you ",myInt);
        int between = input.getInt(1,myInt);
        System.out.printf("Nice very well done, %s was exactly what I was looking for. Now please enter a decimal.%n", between);
        double decimal = input.getDouble();
        System.out.printf("Not quite what I was looking for try again, but this time, ");
        double returned = input.getDouble(0,decimal);
        System.out.printf("%f, was just the ticket, thanks for helping pass that weird captcha! World domination here I come!%n",returned);

    }
}
