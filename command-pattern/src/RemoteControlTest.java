public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        Garage garage = new Garage();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
