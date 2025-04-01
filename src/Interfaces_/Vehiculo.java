package Interfaces_;

public interface Vehiculo {
    void startEngine();
    void stopEngine();

    //myMain
    static String getVehicleType(String vehiculo){
        switch (vehiculo){
            case "PKW":
                return "Personenkraftwagen";
            case "LKW", "Truck":
                return "Lastkraftwagen";
            case "Bike":
                return "Motorrad";
            case "Bus":
                return "Autobus";
            default:
                return "Fahrzeug";

        }
    }


}


