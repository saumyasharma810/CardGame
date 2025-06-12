package serverclient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {
    private final ServerSocket serverSocket;
    private List<ClientHandler> clientHandlers;

    public Server(ServerSocket serverSocket){
        this.serverSocket = serverSocket;

        while(!serverSocket.isClosed()){
            try {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                clientHandlers.add(clientHandler);
                new Thread(clientHandler).start();

            } catch (IOException e){
                e.getStackTrace();
            }
        }
    }
}
