public class Truck extends Auto{
    private Integer LoadCapacity = 5;
    private String BodyType = "закрытый";

    public Truck(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer LoadCapacity, String BodyType) {
        super(brand, engineType, power, weight, mileage);
        this.LoadCapacity = LoadCapacity;
        this.BodyType = BodyType;
    }
    public Truck(Integer mileage, Integer LoadCapacity) {
        super(mileage);
        this.LoadCapacity=LoadCapacity;
    }
    public Truck(){}

    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Truck");
    }

    public Integer getLoadCapacity() {return LoadCapacity;}
    public String getBodyType() {return BodyType;}
}
