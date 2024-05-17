package devices;

public class SmartPhone extends Device {

    //constructor

    public SmartPhone(int screenSize, int batteryLife, int cameraResolution){
        super(screenSize, "touch-screen", batteryLife, cameraResolution);
    }
}
