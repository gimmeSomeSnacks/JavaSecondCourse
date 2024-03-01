package task6.second_pattern;

public class ConcreteFabric implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB();
    }
}
