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




        RemoteControlWithUndo remoteWithUndo = new RemoteControlWithUndo();

        remoteWithUndo.setCommand(0, livingroomLightOn, livingroomLightOff);
        remoteWithUndo.setCommand(1, garageDoorOpen, garageDoorClose);
        remoteWithUndo.setCommand(2, stereoOnWithCD, stereoOff);

        System.out.println(remoteWithUndo);

        remoteWithUndo.onButtonWasPushed(0);
        remoteWithUndo.offButtonWasPushed(0);
        remoteWithUndo.undoButtonWasPushed();
        remoteWithUndo.onButtonWasPushed(1);
        remoteWithUndo.offButtonWasPushed(1);
        remoteWithUndo.undoButtonWasPushed();
        remoteWithUndo.onButtonWasPushed(2);
        remoteWithUndo.offButtonWasPushed(2);
        remoteWithUndo.undoButtonWasPushed();

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        remoteWithUndo.setCommand(3, ceilingFanHigh, ceilingFanOff);

        remoteWithUndo.onButtonWasPushed(3);
        remoteWithUndo.offButtonWasPushed(3);
        remoteWithUndo.undoButtonWasPushed();




        RemoteControlWithUndo macroRemote = new RemoteControlWithUndo();
        Command[] onCommands = {livingroomLightOn, stereoOnWithCD, ceilingFanHigh};
        Command[] offCommands = {livingroomLightOff, stereoOff, ceilingFanOff};

        MacroCommand partyOn = new MacroCommand(onCommands);
        MacroCommand partyOff = new MacroCommand(offCommands);

        macroRemote.setCommand(0, partyOn, partyOff);
        System.out.println(macroRemote);

        macroRemote.onButtonWasPushed(0);
        macroRemote.offButtonWasPushed(0);
        macroRemote.undoButtonWasPushed();
    }
}
