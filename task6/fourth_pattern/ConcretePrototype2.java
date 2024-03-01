package task6.fourth_pattern;

public class ConcretePrototype2 implements Prototype {
    private String name;

    public ConcretePrototype2(String name) {
        this.name = name;
    }
    @Override
    public Prototype Copy() {
        return new ConcretePrototype2(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
