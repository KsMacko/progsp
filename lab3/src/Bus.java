public class Bus extends Auto{
    private Integer AmountOfPlaces = 9;

    public Bus(String brand, String engineType, Integer power, Integer weight, Integer mileage, Integer AmountOfPlaces) {
        super(brand, engineType, power, weight, mileage);
        this.AmountOfPlaces = AmountOfPlaces;
    }
    public Bus(Integer mileage, Integer AmountOfPlaces) {
        super(mileage);
        this.AmountOfPlaces=AmountOfPlaces;
    }
    public Bus(){}
    @Override
    public void brand() {
        System.out.println(this.getBrand()+"is a good mark for Bus");
    }

    public Integer getAmountOfPlaces() {return AmountOfPlaces;}
}
