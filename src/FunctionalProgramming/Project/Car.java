package FunctionalProgramming.Project;

public class Car {

    private String brand;
    private String model;
    private double cost;

    public Car(String brand, String model, double cost) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "brand: " + brand + " || model: " + model + " || cost: " + cost;
    }
}
