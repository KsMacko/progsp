package part2;

public class Bus implements  Auto, Object{
    private String Brand = "mers";;
    private String EngineType = "закрытый";
    private Integer Power = 110;
    private Integer Weight = 1300;
    private Integer Mileage = 0;
    private Integer AmountOfPlaces = 9;

    public Bus(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer amountOfPlaces) {
        Brand = brand;
        EngineType = engineType;
        Power = power;
        Weight = weight;
        Mileage = mileage;
        AmountOfPlaces=amountOfPlaces;
    }
    public Bus(Integer mileage) {
        Mileage = mileage;
    }
    public Bus(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Bus");
    }
    @Override
    public void print(){
        System.out.println("Это автобус");
    }
    public Integer getAmountOfPlaces() {return AmountOfPlaces;}
    public String getBrand() {return Brand;}
    public String getEngineType() {return EngineType;}
    public Integer getPower() {return Power;}
    public Integer getWeight() {return Weight;}
    public Integer getMileage() {return Mileage;}
}
