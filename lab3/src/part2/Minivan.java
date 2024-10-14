package part2;

public class Minivan extends Car{
    public Minivan(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer fuelConsumption, Integer accelerationTime) {
        super(brand, engineType, power, weight, mileage, fuelConsumption, accelerationTime);
    }
    public Minivan(Integer mileage) {super(mileage);}
    public Minivan(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Minivan");
    }
    @Override
    public void print(){
        System.out.println("Это минивен");
    }
}
