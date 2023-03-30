import java.util.Scanner;
public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }
    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, %s.%n",this.name);
    }
    public static void main(String[] args){
        Person riley = new Person("Riley");
        String rileyName = riley.getName();
        System.out.println("Name:"+rileyName);
        riley.setName("Riley Wood");
        riley.sayHello();


    }
}
