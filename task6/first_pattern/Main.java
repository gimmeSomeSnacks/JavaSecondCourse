package task6.first_pattern;

public class Main {
    public static void main(String... args) {
        String type = "Product";
        Product product;
        switch(type) {
            case "Product" :
                product = new ConcreteProduct();
                break;
            default :
                throw new RuntimeException();
        }
    }
}
