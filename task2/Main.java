package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(20, "Nik", "Nik", LocalDate.now(), 70));
        humans.add(new Human(90, "Alim", "Alim", LocalDate.now(), 80));
        humans.add(new Human(100, "Alex", "Alex", LocalDate.now(), 20));
        humans.add(new Human(10, "Vlad", "Vlad", LocalDate.now(), 100));
        int mult = humans.stream()
                .filter(human -> human.getWeight() > 60)
                .sorted(Human::compareTo)
                .sorted(Comparator.comparingInt(Human::getAge))
                .mapToInt(Human::getAge)
                .reduce(1, (a, b) -> a * b);
        System.out.println(mult);
    }
}
