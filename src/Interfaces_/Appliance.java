package Interfaces_;

interface Appliance {
     void turnOn();
}

class Fan implements Appliance{
    @Override
    public void turnOn() {

        System.out.println("turn ON");
    }
}


