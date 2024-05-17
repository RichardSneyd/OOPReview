package devices;

public class Laptop extends Device {

    //constructor

    public Laptop(int screenSize, int batteryLife, int cameraResolution){
        super(screenSize, "keyboard", batteryLife, cameraResolution);
    }
}
