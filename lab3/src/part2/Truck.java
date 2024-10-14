package part2;

public class Truck implements Auto, Object{
    private String Brand = "mers";;
    private String EngineType = "закрытый";
    private Integer Power = 110;
    private Integer Weight = 1300;
    private Integer Mileage = 0;
    private Integer LoadCapacity = 5;
    private String BodyType = "закрытый";
    public Truck(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer loadCapacity, String bodyType) {
        Brand = brand;
        EngineType = engineType;
        Power = power;
        Weight = weight;
        Mileage = mileage;
        LoadCapacity=loadCapacity;
        BodyType=bodyType;
    }
    public Truck(Integer mileage) {
        Mileage = mileage;
    }
    public Truck(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Truck");
    }
    @Override
    public void print(){
        System.out.println("Это грузовик");
    }
    public String getBrand() {return Brand;}
    public String getEngineType() {return EngineType;}
    public Integer getPower() {return Power;}
    public Integer getWeight() {return Weight;}
    public Integer getMileage() {return Mileage;}
    public Integer getLoadCapacity() {return LoadCapacity;}
    public String getBodyType() {return BodyType;}
}
