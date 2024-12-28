import java.io.*;
import java.net.*
;
public class TCPServer {
 public static void main(String[] args) throws IOException{
    ServerSocket serverSocket = new ServerSocket(5000);
    System.out.println("Server is Running....");

    Socket socket = serverSocket.accept();
    DataInputStream in = new DataInputStream(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    int num1 = in.readInt();
    int num2 = in.readInt();
    int greatest = Math.max(num1, num2);

    out.writeInt(greatest);
    socket.close();
    serverSocket.close();
    
 }   
}
