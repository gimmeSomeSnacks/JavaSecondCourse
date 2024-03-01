package task6.third_pattern;

public class Director {
    public Product construct(Builder builder) {
        builder.buildPartOne();
        builder.buildPartTwo();
        builder.buildPartThree();
        return builder.getResult();
    }
}
