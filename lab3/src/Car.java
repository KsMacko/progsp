public class Car extends  Auto{
    private Integer FuelConsumption = 8;
    private Integer AccelerationTime = 4;

    public Car(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer fuelConsumption, Integer accelerationTime) {
        super(brand, engineType, power, weight, mileage);
        FuelConsumption = fuelConsumption;
        AccelerationTime = accelerationTime;
    }
    public Car(Integer mileage) {
        super(mileage);
    }
    public Car(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Car");
    }

    public Integer getFuelConsumption() {return FuelConsumption;}
    public Integer getAccelerationTime() {return AccelerationTime;}
}
