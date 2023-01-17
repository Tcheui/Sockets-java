import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.*;

public class Main{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4000); // server inicia na porta 4000
        Socket socket = serverSocket.accept(); //espera conexão
        System.out.println("cliente conectou");

        InputStreamReader inputReader = new InputStreamReader(socket.getInputStream());
        PrintStream saida = new PrintStream(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(inputReader);
        String x;
        while((x = reader.readLine()) != null){
            System.out.println("Servidor: " + x);
        }
    }
}