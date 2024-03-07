public class CommandPattern {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);

        remoteControl.pressButton();
    }
}