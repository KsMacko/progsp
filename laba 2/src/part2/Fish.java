package part2;

public class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("плавает");
    }

    @Override
    public void sound() {
        System.out.println("...");
    }
    public Fish(String name, String type, String color, String foodType){
        super(name, type, color, foodType);
    }
}
