public class Stereo {
    String room;
    String cd;
    int volume;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Turn on the stereo!!!");
    }

    public void off() {
        System.out.println("Turn off the stereo!!!");
    }

    public void setCD(String cd) {
        this.cd = cd;
        System.out.println("Set CD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Set volume to " + volume);
    }
}
