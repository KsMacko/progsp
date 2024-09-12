package part2;

public class Fly extends Animal{
    @Override
    public void move() {
        System.out.println("летает и ползает");
    }

    @Override
    public void sound() {
        System.out.println("БЗЗЗЗззззЗЗЗЗЗЗЗЗзззззЗЗЗЗЗЗ");
    }
    public Fly(String name, String type, String color, String foodType){
        super(name, type, color, foodType);
    }
}
