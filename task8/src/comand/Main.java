package comand;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        LightChangeColorCommand lightChangeColorCommand = new LightChangeColorCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(lightChangeColorCommand);
        remoteControl.pressButton();
    }
}
