import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {
        Person[] peopleCopy = Arrays.copyOf(peopleArray, peopleArray.length + 1);

        peopleCopy[peopleCopy.length - 1] = newPerson;

        return peopleCopy;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        Person personOne = new Person("Gary");
        Person personTwo = new Person("Ned");
        Person personThree = new Person("Ted");

        Person[] people = {personOne, personTwo, personThree};

        for (Person person : people) {
            System.out.println(person.getName());
        }
        people = addPerson(people, new Person("Terry"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
