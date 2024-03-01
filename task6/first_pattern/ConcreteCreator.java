package task6.first_pattern;

public class ConcreteCreator extends Creator{

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
