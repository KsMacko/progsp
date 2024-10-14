package part1;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bus bus = new Bus();
        Car car = new Car();
        WriterInfo.ShowInfo(car);
        WriterInfo.ShowInfo(bus);
        WriterInfo.ShowInfo(truck);
    }
}