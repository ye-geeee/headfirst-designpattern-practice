public interface ControllerInterface {
    void start();

    void stop();

    void setBPM(int bpm);

    void increaseBPM();

    void decreaseBPM();
}
