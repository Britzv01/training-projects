package Interface.SmartDevice;

public interface SmartDevice {
    void activate();
    void displayStatus();

    public static void main(String [] args){
        SmartLight light = new SmartLight();
        SmartThermostat thermostat = new SmartThermostat();
        SmartCamera camera = new SmartCamera();

        SmartDevice[] devices = {light, thermostat, camera};

        for (SmartDevice device : devices){
            device.activate();
            device.displayStatus();
            System.out.println("----------------");
        }
    }
}

class SmartLight implements SmartDevice{

    int brightness;

    @Override
    public void activate(){
        brightness = 100;
    }

    @Override
    public void displayStatus(){
        System.out.println("Smart Light");
        System.out.printf("Brightness: %d%n", brightness);
    }
}

class SmartThermostat implements SmartDevice {
    double temperature;

    @Override
    public void activate(){
        temperature = 24.0;
    }

    @Override
    public void displayStatus(){
        System.out.println("Smart Thermostat");
        System.out.printf("Temperature: %f%n", temperature);
    }
}

class SmartCamera implements SmartDevice {
    boolean isRecording;

    @Override
    public void activate(){
        isRecording = true;
    }

    @Override
    public void displayStatus(){
        System.out.println("Smart Camera");
        System.out.printf("Recording: %B%n", isRecording);
    }
}


