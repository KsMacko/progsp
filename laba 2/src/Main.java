public class Main {

    public static void main(String[] args) {
        Ward [] wards  =new Ward[5];
        wards[0] = new Ward();
        wards[1] = new Ward("Врач",true,15);
        wards[2] = new Ward("Додик",false,12);
        wards[3] = new Ward(true,7);
        wards[4] = new Ward(wards[3]);

        for(int i=0;i<20;i++){
            if(i>10 && i%2==0){
                System.out.println(i);
            }
        }


    }
}