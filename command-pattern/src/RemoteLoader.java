public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Garage garage = new Garage("Garage");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingroomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingroomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLigntOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garage);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingroomLightOn, livingroomLightOff);
        remote.setCommand(1, kitchenLigntOn, kitchenLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, garageDoorOpen, garageDoorClose);
        remote.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
    }
}
