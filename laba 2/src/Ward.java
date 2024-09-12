public class Ward {
    private String surname;
    private Integer places;
    private boolean freePlaces;
    public Ward(String surname, Boolean freePlaces, Integer places){
        this.freePlaces=freePlaces;
        this.places= places;
        this.surname=surname;
    }
    public Ward(Boolean freePlaces, Integer places){
        this.freePlaces=freePlaces;
        this.places= places;
    }
    public Ward(Ward object){
        this.freePlaces = object.freePlaces;
        this.places =object.places;
        this.surname=object.surname;
    }
    public Ward() {
        this. freePlaces = true;
        this.places= 8;
        this.surname="Баранович";
    }

    public String getSurname() {return surname;}
    public Integer getPlaces() {return places;}
    public boolean isFreePlaces() {return freePlaces;}
    public void ShowData(){
        System.out.println("Врач - "+this.getSurname()+", количсетво мест - "+ this.getPlaces()+", свободные места - "+this.isFreePlaces() );
    }

}
