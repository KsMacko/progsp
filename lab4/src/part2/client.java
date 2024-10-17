package part2;

import java.net.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

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

    public void runClient() {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("|cos(x) - e^y|^(1 + 2*(lny)^2) * (1 + z + z^2/2 + z^3/3)");
            try {
                byte[] buf;
                String sendData = "";
                int i = 0;
                do {
                    String value = "";
                    switch (i) {
                        case 0 -> value = "x";
                        case 1 -> value = "y";
                        case 2 -> value = "z";
                    }
                    sendData += GetIntInput(scanner, "Введите " + value + ": ");
                    sendData += "_";
                    i++;
                } while (i < 3);
                buf = sendData.getBytes(StandardCharsets.UTF_8);

                DatagramSocket s = new DatagramSocket();
                DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 1050);
                s.send(sendPacket);
                buf = new byte[Double.BYTES];
                 DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);
                s.receive(recvPacket);

                double receivedResponse = ByteBuffer.wrap(recvPacket.getData()).getDouble();
                System.out.println("Результат выполнения функции: " + receivedResponse);
                s.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }while (true);
    }
    public static void main(String[] args) {
        client client = new client();
        client.runClient();
    }
}

