package classpackage;

public class Ward {
    private String surname;
    private Integer places;
    private boolean freePlaces;
    public static Integer AllFreePlaces = 0;
    public static Integer AllFreeWards = 0;
    public Ward(String surname, Boolean freePlaces, Integer places){
        this.freePlaces=freePlaces;
        this.places= places;
        this.surname=surname;
        if(freePlaces){
            AllFreeWards++;
            AllFreePlaces += places;
        }
    }
    public Ward(Boolean freePlaces, Integer places){
        this.freePlaces=freePlaces;
        this.places= places;
        if(freePlaces){
            AllFreeWards++;
            AllFreePlaces += places;
        }
    }
    public Ward(Ward object){
        this.freePlaces = object.freePlaces;
        this.places =object.places;
        this.surname=object.surname;
        if(freePlaces){
            AllFreeWards++;
            AllFreePlaces += places;
        }
    }
    public Ward() {
        this. freePlaces = true;
        this.places= 8;
        this.surname="Баранович";
        AllFreeWards++;
        AllFreePlaces += places;
    }

    public String getSurname() {return surname;}
    public Integer getPlaces() {return places;}
    public boolean isFreePlaces() {return freePlaces;}
    public void ShowData(){
        System.out.println("Врач - "+this.getSurname()+", количсетво мест - "+ this.getPlaces()+", свободные места - "+this.isFreePlaces() );
    }
    public  static void ShowFreePlaces(Ward[] array){
        int freePlace = 0;
        int freeWard = 0;
        for (Ward ward : array) {
            if (ward.freePlaces) {
                freePlace += ward.places;
                freeWard++;
            }
        }
        System.out.println("Свободные палаты: "+ freeWard+"  Свободных мест: "+ freePlace);
    }

}
