import java.time.LocalDate;

public class Human implements Comparable<Human> {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public int compareTo(Human o) {
        return firstName.compareTo(o.firstName);
    }
}
