package task6.third_pattern;

public class ConcreteBuilder implements Builder{
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartOne() {
        product.setPartOne("partOne");
    }

    @Override
    public void buildPartTwo() {
        product.setPartTwo("partTwo");
    }

    @Override
    public void buildPartThree() {
        product.setPartThree("partThree");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
