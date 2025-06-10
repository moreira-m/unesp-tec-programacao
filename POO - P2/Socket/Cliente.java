import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 4040);

            //Le a mensagem enviada pelo servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensagem = in.readLine();
            System.out.println("Mensagem do servidor: " + mensagem);

            in.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
