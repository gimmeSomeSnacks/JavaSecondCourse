package task6.third_pattern;

public class Main {
    public static void main(String... args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product product = director.construct(concreteBuilder);
        System.out.println(product.toString());
    }
}
