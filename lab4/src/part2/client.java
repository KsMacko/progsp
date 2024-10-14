package part2;

import java.net.*;
import java.io.*;
public class client {
    public void runClient() throws IOException {
        DatagramSocket s = null;
        try {
            byte[] buf = new byte[512];
            s = new DatagramSocket();
            System.out.println("UDPClient: Started");
            byte[] verCmd = { 'V', 'E', 'R', 'S' };
            DatagramPacket sendPacket = new DatagramPacket(verCmd, verCmd.length, InetAddress.getByName("127.0.0.1"), 8001);
            s.send(sendPacket);
            DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);
            s.receive(recvPacket);
            String version = new String(recvPacket.getData()).trim();
            System.out.println("UDPClient: Server Version: " + version);
            byte[] quitCmd = { 'Q', 'U', 'I', 'T' };
            sendPacket.setData(quitCmd);
            sendPacket.setLength(quitCmd.length);
            s.send(sendPacket);
            System.out.println("UDPClient: Ended");
        }
        finally {
            if (s != null) {
                s.close();
            }  }  }
    public static void main(String[] args) {//метод main
        try {
            client client = new client();
            client.runClient();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

