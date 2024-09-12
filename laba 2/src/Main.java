public class Main {

    public static void main(String[] args) {
        Ward w1 = new Ward("Врач",true,15);
        Ward w2 = new Ward("Додик",false,12);
        Ward w3 = new Ward(true,7);
        w1.ShowSurname();
        w1.ShowFreePlaces();
        w3.ShowPlaces();
//        WriterInfo.GetData(w2);
//        WriterInfo.GetData(w3);
        for(int i=0;i<20;i++){
            if(i>10 && i%2==0){
                System.out.println(i);
            }
        }


    }
}