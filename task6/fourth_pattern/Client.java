package task6.fourth_pattern;

public class Client{
    public static void main(String... args) {
        Prototype prototype1 = new ConcretePrototype1("One");
        Prototype prototype2 = new ConcretePrototype2("Two");

        Prototype proto1 = prototype1.Copy();
        Prototype proto2 = prototype2.Copy();

        System.out.println(proto1.getName() + " " + prototype1.getName());
        System.out.println(proto2.getName() + " " + prototype2.getName());
    }
}
