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
        this.surname = "Врач";
    }

    public String getSurname() {return surname;}
    public Integer getPlaces() {return places;}
    public boolean isFreePlaces() {return freePlaces;}
    public void ShowSurname(){System.out.println(surname);}
    public void ShowPlaces(){System.out.println(places);}
    public void ShowFreePlaces(){System.out.println(freePlaces);}

}
