package serverclient;

import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private final Socket socket;

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            socket.getInputStream();
        } catch (IOException e){
            e.getStackTrace();
        }

    }

}
