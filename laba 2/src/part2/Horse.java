package part2;

public class Horse extends Animal{
    @Override
    public void move() {
        System.out.println("бегает и прыгает");
    }

    @Override
    public void sound() {
        System.out.println("гогочет");
    }
    public Horse(String name, String type, String color, String foodType){
        super(name, type, color, foodType);
    }
}
