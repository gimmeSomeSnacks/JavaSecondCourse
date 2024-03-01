package task6.third_pattern;

public class Product {
    private String partOne;
    private String partTwo;
    private String partThree;

    public Product() {
        partOne = "";
        partTwo = "";
        partThree = "";
    }

    public void setPartOne(String partOne) {
        this.partOne = partOne;
    }

    public void setPartTwo(String partTwo) {
        this.partTwo = partTwo;
    }

    public void setPartThree(String partThree) {
        this.partThree = partThree;
    }

    public String getPartOne() {
        return partOne;
    }

    public String getPartTwo() {
        return partTwo;
    }

    public String getPartThree() {
        return partThree;
    }

    @Override
    public String toString() {
        return getPartOne() + " " + getPartTwo() + " " + getPartThree();
    }
}
