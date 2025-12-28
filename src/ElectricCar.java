public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String brand, int year, int doors, int batteryCapacity) {
        super(brand, year, doors, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car started silently.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric car stopped.");
    }
}