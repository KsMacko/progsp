import java.io.*;
import java.net.*;//импорт пакета, содержащего классы для
import java.util.Scanner;

// работы в сети
public class client {
    public static int GetIntInput(Scanner scanner, String message){
        int input = 0;
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Некорректный ввод!");
                scanner.next();
            }
        }
        return input;
    }
    public static void printMatrix(int[][] arr){
        for(int[] i: arr){
            for(int j: i){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    public static void PrintMatrix(String[][] array){
        for(String[] i: array){
            for(String j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg) {
        try {
            Scanner s = new Scanner(System.in);
            int[][] array = new int[3][3];

            Socket clientSocket = new Socket("127.0.0.1",2525);
            System.out.println("connection established....");

            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream coos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream  cois = new ObjectInputStream(clientSocket.getInputStream());

            System.out.println("Введите значения матрицы 3*3");
            for(int i=0;i< array.length;i++){
                for(int j=0;j< array.length;j++){
                    System.out.println("Матрица:");
                    printMatrix(array);
                    array[i][j] = GetIntInput(s, "Значение: ");

                }
            }
            System.out.println("Матрица:");
            printMatrix(array);

            coos.writeObject(array);
            String[][] gotArr = (String[][]) cois.readObject();
            System.out.println("\nРезультат: ");
            PrintMatrix(gotArr);
            coos.close();
            cois.close();
            clientSocket.close();
        }catch(Exception e)	{
            e.printStackTrace();
        }
    }
}
