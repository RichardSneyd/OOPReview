package devices;

//properties
public abstract class Device {
    private int screenSize;
    private String inputType;
    private int batteryLife;
    private int cameraResolution;


    //constructor
    public Device(int screenSize, String inputType, int batteryLife, int cameraResolution) {
        this.screenSize = screenSize;
        this.inputType = inputType;
        this.batteryLife = batteryLife;
        this.cameraResolution = cameraResolution;

    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return this.screenSize;
    }

    //input type

//    public void setInputType(String inputType){
//        this.inputType = inputType;
//    }

    public String getInputType() {
        return this.inputType;
    }



    public int getBatteryLife() {
        return this.batteryLife;
    }

    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }

    public int getCameraResolution(){
        return this.cameraResolution;
    }

    public void setCameraResolution(int cameraResolution){
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Device{" +
                "screenSize=" + screenSize +
                ", inputType='" + inputType + '\'' +
                ", batteryLife=" + batteryLife +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}


// Device myIPhone = new Device(6, "touch screen", 24, 20);