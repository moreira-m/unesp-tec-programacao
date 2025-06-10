import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        // 1. Cria um ServerSocket que "escuta" na porta 12345
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Servidor aguardando conexões na porta 12345...");

            // 2. O método accept() bloqueia a execução até que um cliente se conecte
            Socket clientSocket = serverSocket.accept(); // Retorna uma instância de Socket 
            System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());

            // 3. Obtém os fluxos de entrada e saída de bytes
            InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            
            byte[] buffer = new byte[1024];
            int bytesRead;

            // 4. Loop para ler os dados do cliente e ecoá-los de volta
            while ((bytesRead = in.read(buffer)) != -1) {
                String received = new String(buffer, 0, bytesRead);
                System.out.println("Recebido do cliente: " + received.trim());

                // Envia os mesmos dados de volta (eco)
                out.write(buffer, 0, bytesRead);

                if (received.trim().equalsIgnoreCase("sair")) {
                    break;
                }
            }
            System.out.println("Conexão com o cliente encerrada.");
        }
    }
}