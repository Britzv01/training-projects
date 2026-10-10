package Polymorphism.Exercise;

public class Appliance {
    boolean isApplianceOn;

    Appliance(){
        isApplianceOn = false;
    }
    void turnOn(){
        System.out.println("Appliance is starting");
        isApplianceOn = true;
    }

    public static void main(String [] main){
        WashingMachine wm = new WashingMachine();
        Microwave microwave = new Microwave();

        System.out.println((wm.isApplianceOn) ? "Yes" : "No");
        wm.turnOn();
        System.out.println((wm.isApplianceOn) ? "Yes" : "No");

        System.out.println((microwave.isApplianceOn) ? "Yes" : "No");
        microwave.turnOn();
        System.out.println((microwave.isApplianceOn) ? "Yes" : "No");
    }
}

class WashingMachine extends Appliance {
    @Override
    void turnOn(){
        System.out.println("Washing machine is spinning");
        isApplianceOn = true;
    }
}

class Microwave extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Microwave is heating");
        isApplianceOn = true;
    }
}
