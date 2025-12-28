public class Main {
    public static void main(String[] args){

        Driver driver1 = new Driver("Alikhan", "A302025");
        Driver driver2 = new Driver("Ilia", "B402025");

        Vehicle car = new Car("BMW", 2025, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2020,false);
        Vehicle truck = new Truck("Volvo",2015, 12.5,4);
        ElectricCar tesla = new ElectricCar("Tesla", 2024, 4, 75);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);
        tesla.setDriver(driver2);
        Vehicle[] vehicles = {car, motorcycle, truck, tesla };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.displayDriverInfo();
            v.stopEngine();
            System.out.println("--------------------");
        }
    }
}