import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    private static final String PORT = System.getenv("PORT");

    public static void main(String[] args) {
        ApiContextInitializer.init();

        TelegramBotsApi telegram = new TelegramBotsApi();
        Bot bot = new Bot();
        try {
            telegram.registerBot(bot);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
        try (ServerSocket serverSocket = new ServerSocket(Integer.valueOf(PORT))) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
