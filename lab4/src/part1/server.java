package part1;

import java.io.*;
import java.net.*;

public class server {
    public static int[][] AlgebraicAdditionMatrix(int[][]array){
        int[][] newMatrix = new int[3][3];
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                newMatrix[i][j] = (int) (Math.pow(-1,(i+j+2))*findMinorDeterminant(findMinor(array,i,j)));
            }
        }
        return newMatrix;
    }
    public static int findMinorDeterminant(int[][] arr){
        return arr[0][0]*arr[1][1]-arr[1][0]*arr[0][1];
    }
    public static int findDeterminant(int[][] arr){
        int det = 0;
        for(int i=0;i< arr.length;i++){
            det += (int) Math.pow(-1,i+2)*arr[0][i]*findMinorDeterminant(findMinor(arr,0,i));
        }
        return det;
    }
    public static int[][] findMinor(int[][] array, int row, int column){
        int[][] minor = new int[2][2];
        int minotRow=0;
        int minorColumn = 0;
        for(int i=0;i< array.length;i++){
            if(i == row){
                continue;
            }
            for(int j=0;j< array.length;j++){
                if(j!=column){
                    minor[minotRow][minorColumn]=array[i][j];
                    minorColumn++;
                }
            }
            minorColumn=0;
            minotRow++;
        }
        System.out.println("\n\n");
        return minor;
    }
    public static int[][] Transpose(int[][] array){
        int[][] res = new int[3][3];
        for(int i =0; i<array.length; i++){
            for(int j=0;j<array.length;j++){
                res[j][i]=array[i][j];
            }
        }
        return res;
    }
    public static String[][] GetResultArray(int[][] array){
        int det = findDeterminant(array);
        int[][] alg_trans_arr = Transpose(AlgebraicAdditionMatrix(array));
        String[][] res = new String[3][3];
        for(int i=0;i< alg_trans_arr.length;i++){
            for(int j=0;j< alg_trans_arr.length;j++) {
                if(alg_trans_arr[i][j]%det==0){
                    res[i][j]=""+(alg_trans_arr[i][j]%det);
                }
                else{
                    res[i][j] = alg_trans_arr[i][j]+"/"+det;
                }
            }
        }
        return res;
    }
    public static void PrintMatrix(int[][] array){
        for(int[] i: array){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        ServerSocket serverSocket = null;
        Socket clientAccepted     = null;
        ObjectInputStream  sois   = null;
        ObjectOutputStream soos   = null;
        try {
            System.out.println("part1.server starting....");
            serverSocket = new ServerSocket(2525);
            clientAccepted = serverSocket.accept();
            System.out.println("connection established....");


            sois = new ObjectInputStream(clientAccepted.getInputStream());
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());
            int[][] clientRecievedObject = (int[][])sois.readObject();


            System.out.println("Полученная матрица: ");
            PrintMatrix(clientRecievedObject);
            soos.writeObject(GetResultArray(clientRecievedObject));
        }catch(Exception e)	{}
        finally {
            try {
                sois.close();
                soos.close();
                clientAccepted.close();
                serverSocket.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
}
}
