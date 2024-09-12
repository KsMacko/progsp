package part2;

public abstract class Animal implements Move{
    private  String name;
    private String color;
    private String type;
    private String foodType;
    public Animal(String name, String color, String type, String foodType){
        this.name=name;
        this.color=color;
        this.type=type;
        this.foodType=foodType;
    }
    public abstract void sound();
}
