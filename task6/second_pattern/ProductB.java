package task6.second_pattern;

public class ProductB implements AbstractProduct {
    @Override
    public void ProductCreated() {
        System.out.println("ProductB created");
    }

    public ProductB() {
        ProductCreated();
    }
}
