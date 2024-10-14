package part2;

import java.net.*;
import java.io.*;
public class server {
    public final static int DEFAULT_PORT = 8001;
    public final String VERSION_CMD = "VERS";
    public final String QUIT_CMD = "QUIT";
    public final byte[] VERSION = { 'V', '2', '.', '0' };
    public final byte[] UNKNOWN_CMD = { 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ',
            'c', 'o', 'm', 'm', 'a', 'n', 'd' };
    public void runServer() throws IOException {
        DatagramSocket s = null;
        try {
            boolean stopFlag = false;
            byte[] buf = new byte[512];
            s = new DatagramSocket(DEFAULT_PORT);
            System.out.println("UDPServer: Started on " + s.getLocalAddress() + ":"
                    + s.getLocalPort());
            while(!stopFlag) {
                DatagramPacket recvPacket = new DatagramPacket(buf, buf.length);
                s.receive(recvPacket);
                String cmd = new String(recvPacket.getData()).trim();
                System.out.println("UDPServer: Command: " + cmd);
                DatagramPacket sendPacket = new DatagramPacket(buf, 0, recvPacket.getAddress(), recvPacket.getPort());//формирование объекта                                                                  // дейтаграммы для отсылки данных
                int n = 0;
                if (cmd.equals(VERSION_CMD)) {
                    n = VERSION.length;
                    System.arraycopy(VERSION, 0, buf, 0, n);
                }
                else if (cmd.equals(QUIT_CMD)) {
                    stopFlag = true;
                    continue;
                }
                else {
                    n = UNKNOWN_CMD.length;
                    System.arraycopy(UNKNOWN_CMD, 0, buf, 0, n);
                }
                sendPacket.setData(buf);
                sendPacket.setLength(n);
                s.send(sendPacket);
            }
            System.out.println("UDPServer: Stopped");
        }
        finally {
            if (s != null) {
                s.close();
            }
        }
    }
    public static void main(String[] args) {
        try {
            server udpSvr = new server();
            udpSvr.runServer();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

