import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());

        if(update.getMessage().getText().equals("привет")){
            sendMessage.setText("привет я работаю");
            try {
            execute(sendMessage);
            }catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
        return "@OurCrimeaBot";
    }

    public String getBotToken() {
        return "1698243545:AAGrcF7G8mfw1Hb-zdlxcd-bzPtVudtReGY";
    }


}
