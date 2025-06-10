import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        // Conecta ao servidor no endereço "localhost" (esta máquina) na porta 12345
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Conectado ao servidor. Digite 'sair' para encerrar.");
            
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            try (Scanner consoleScanner = new Scanner(System.in)) {
                String line;
                byte[] buffer = new byte[1024];
                
                // Loop para ler a entrada do usuário e enviar ao servidor
                while (true) {
                    System.out.print("Digite uma mensagem: ");
                    line = consoleScanner.nextLine();
                    
                    // Envia a mensagem para o servidor
                    out.write(line.getBytes());

                    // Recebe a resposta do servidor (eco)
                    int bytesRead = in.read(buffer);
                    String response = new String(buffer, 0, bytesRead);
                    System.out.println("Eco do servidor: " + response.trim());
                    
                    if (line.equalsIgnoreCase("sair")) {
                        break;
                    }
                }
            }
        }
    }
}