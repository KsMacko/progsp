package part2;

public abstract class Car implements Auto, Object{
    private String Brand = "mers";;
    private String EngineType = "закрытый";
    private Integer Power = 110;
    private Integer Weight = 1300;
    private Integer Mileage = 0;
    private Integer FuelConsumption = 8;
    private Integer AccelerationTime = 4;
    public Car(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer fuelConsumption, Integer accelerationTime) {
        Brand = brand;
        EngineType = engineType;
        Power = power;
        Weight = weight;
        Mileage = mileage;
        FuelConsumption=fuelConsumption;
        AccelerationTime=accelerationTime;

    }
    public Car(Integer mileage) {
        Mileage = mileage;
    }
    public Car(){}

    public String getBrand() {return Brand;}
    public String getEngineType() {return EngineType;}
    public Integer getPower() {return Power;}
    public Integer getWeight() {return Weight;}
    public Integer getMileage() {return Mileage;}
    public Integer getAccelerationTime() {return AccelerationTime;}
    public Integer getFuelConsumption() {return FuelConsumption;}
}
