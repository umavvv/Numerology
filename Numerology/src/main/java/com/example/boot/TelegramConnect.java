package com.example.boot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class TelegramConnect extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Numerology001_bot";
    }

    @Override
    public String getBotToken() {
        return "5944419305:AAH2mQrl6ktQyA8uaCs_RPr6uahsrgiHJ1U";
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            switch (message.getText()) {
                case "/start":    // Запуск бота
                    sendMsg(message, "lsl");// В ответ будет передоваться правильный ответ из БД
                    break;
                default:

            }
        }

    }
}