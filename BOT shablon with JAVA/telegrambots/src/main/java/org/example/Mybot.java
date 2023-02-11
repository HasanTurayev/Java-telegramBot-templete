package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Mybot extends TelegramLongPollingBot {
    String BotUsername="username";
    String BotToken="botToken";

    @Override
    public String getBotUsername() {
        return BotUsername;
    }

    @Override
    public String getBotToken() {
        return BotToken;
    }


    @Override
    public void onUpdateReceived(Update update) {
        Message message=update.getMessage();
        if(update.hasMessage()){
            String text = update.getMessage().getText();
            if(text.equals("/start")){
                System.out.println("Habar keldi...");
            }
        }
    }
}
