package task6.second_pattern;

public class Client {
    public static void main(String... args) {
        ConcreteFabric concreteFabric = new ConcreteFabric();
        AbstractProduct product;
        String type = "ProductA";
        switch(type) {
            case "ProductA":
                product = concreteFabric.createProductA();
                break;
            case "ProductB":
                product = concreteFabric.createProductB();
                break;
            default:
                throw new RuntimeException();
        }
    }
}
