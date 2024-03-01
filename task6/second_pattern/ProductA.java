package task6.second_pattern;

public class ProductA implements AbstractProduct {
    @Override
    public void ProductCreated() {
        System.out.println("ProductA created");
    }

    public ProductA() {
        ProductCreated();
    }
}
