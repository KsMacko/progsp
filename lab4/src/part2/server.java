package part2;

import java.net.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.Arrays;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.E;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class server {
    public final static int DEFAULT_PORT = 1050;
    public double Function(double[] values){
        double x = values[0];
        double y = values[1];
        double z = values[2];
        return pow(abs(cos(x)-pow(E,y)),1+2*pow(log(y),2)*(1+z+z*z/2+z*z*z/3));
    }
    public static double roundTo4DecimalPlaces(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));//в строку, чтоб не терять точность
        bd = bd.setScale(4, RoundingMode.HALF_UP);//4 знака, округление вверх
        return bd.doubleValue();
    }

    public void doSmth() {
        do {
            try {
                byte[] buf = new byte[255];
                DatagramSocket s = new DatagramSocket(DEFAULT_PORT);
                System.out.println("UDPServer: Started on " + s.getLocalAddress() + ":"
                        + s.getLocalPort());
                DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);
                s.receive(recvPacket);
                String receivedData = new String(recvPacket.getData(), 0, recvPacket.getLength()).trim();
                double[] values = Arrays.stream(receivedData.split("_")).filter(x -> !x.isEmpty()).mapToDouble(Double::parseDouble).toArray();
                double res = roundTo4DecimalPlaces(Function(values));
                buf = new byte[Double.BYTES];
                DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, recvPacket.getAddress(), recvPacket.getPort());//формирование объекта
                ByteBuffer bb = ByteBuffer.wrap(buf);//создает новый ByteBuffer, который обертывает существующий массив байтов
                bb.putDouble(res);
                sendPacket.setData(buf);
                s.send(sendPacket);
            } catch (IOException e) {
                System.out.println(e);
            }
        }while(true);
    }
    public static void main(String[] args) {
        server s = new server();
        s.doSmth();
    }
}

