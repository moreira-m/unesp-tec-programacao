import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4040);
            
            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado: " + cliente);

            //Envia uma mensagem para o cliente
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            out.close();
            cliente.close();
            servidor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
