package part1;

public class Auto {
    private String Brand = "mers";;
    private String EngineType = "закрытый";
    private Integer Power = 110;
    private Integer Weight = 1300;
    private Integer Mileage = 0;

    public void brand(){}

    public Auto(String brand, String engineType, Integer power, Integer weight, Integer mileage) {
        Brand = brand;
        EngineType = engineType;
        Power = power;
        Weight = weight;
        Mileage = mileage;
    }
    public Auto(Integer mileage) {
        Mileage = mileage;
    }
    public Auto(){}

    public String getBrand() {return Brand;}
    public String getEngineType() {return EngineType;}
    public Integer getPower() {return Power;}
    public Integer getWeight() {return Weight;}
    public Integer getMileage() {return Mileage;}
}
