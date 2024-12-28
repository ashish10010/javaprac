import java.io.*;
import java.net.*;
public class TCPClinet{
 public static void main(String[] args) throws IOException{
    Socket socket = new Socket("localhost", 5000);

    DataInputStream in = new DataInputStream(socket.getInputStream());
    DataOutputStream out = new DataOutputStream(socket.getOutputStream());

    out.writeInt(10);
    out.writeInt(15);
    int result = in.readInt();

    System.out.println("Greatest Number is: " + result);

    socket.close();
    
 }    
}
