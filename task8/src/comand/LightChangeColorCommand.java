package comand;

public class LightChangeColorCommand implements Command{
    private Light light;

    public LightChangeColorCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.changeColor();
    }
}
