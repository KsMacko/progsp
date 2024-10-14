package part2;

public class Picap extends Car{
    public Picap(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer fuelConsumption, Integer accelerationTime) {
        super(brand, engineType, power, weight, mileage, fuelConsumption, accelerationTime);
    }
    public Picap(Integer mileage) {super(mileage);}
    public Picap(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Minivan");
    }
    @Override
    public void print() {
        System.out.println("Это минивен");
    }
}
