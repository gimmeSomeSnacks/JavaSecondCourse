package Bridge;

public class Main {
    public static void main(String... args) {
        Shape shape = new Rectangle(new BlackColor());
        shape.draw();
    }
}
