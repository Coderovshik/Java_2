import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(
            new Human(
                81, 
                "Theodore", 
                "Kaczynski", 
                LocalDate.of(1942, 5, 22), 
                75
            )
        );
        humans.add(
            new Human(
                66, 
                "Jeffrey", 
                "Epstein", 
                LocalDate.of(1953, 1, 20), 
                65
            )
        );
        humans.add(
            new Human(
                19, 
                "Edward", 
                "Snowden", 
                LocalDate.of(1983, 7, 21), 
                60
            )
        );
        humans.add(
            new Human(
                47, 
                "Cillian", 
                "Murphy", 
                LocalDate.of(1976, 5, 25), 
                70
            )
        );
        humans.add(
            new Human(
                13, 
                "Michael", 
                "Jackson", 
                LocalDate.of(1958, 9, 29), 
                80
            )
        );

        Stream<Human> humanStream = humans.stream();
        String names = humanStream
            .sorted(Collections.reverseOrder())
            .filter(a -> a.age > 20)
            .limit(3)
            .map(a -> a.firstName)
            .collect(Collectors.joining(" "));

        System.out.println(names);
    }
}