public class WriterInfo {

    public static void GetData(Ward ward){
        System.out.println("Врач - "+ward.getSurname()+", количсетво мест - "+ ward.getPlaces()+", свободные места - "+ward.isFreePlaces() );
    }
}
