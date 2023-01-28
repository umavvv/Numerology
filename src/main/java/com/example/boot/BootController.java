package com.example.boot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BootController extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Numerology001_bot";
    }

    @Override
    public String getBotToken() {
        return "5944419305:AAH2mQrl6ktQyA8uaCs_RPr6uahsrgiHJ1U";
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();            //создали объект класса, то бишь проинициализировали отправленное сообщение
        sendMessage.enableMarkdown(true);                            //включили возможность разметки
        sendMessage.setChatId(message.getChatId().toString());      //определяем ID чата, чтобы знать на какой конкретно чат нужно отправить ответ
        sendMessage.setReplyToMessageId(message.getMessageId());    //определяем ID сообщения, чтобы знать на какое ответить
        sendMessage.setText(text);                                  //установить сообщению текст, который отправили в метод
    }

    @Override
    public void onUpdateReceived(Update update) {
        try{
            if(update.hasMessage() && update.getMessage().hasText())
            {
                //Извлекаем из объекта сообщение пользователя
                Message inMess = update.getMessage();
                //Достаем из inMess id чата пользователя
                String chatId = inMess.getChatId().toString();
                //Получаем текст сообщения пользователя, отправляем в написанный нами обработчик
                String response = parseMessage(inMess.getText());
                //Создаем объект класса SendMessage - наш будущий ответ пользователю
                SendMessage outMess = new SendMessage();

                //Добавляем в наше сообщение id чата а также наш ответ
                outMess.setChatId(chatId);
                outMess.setText(response);

                //Отправка в чат
                execute(outMess);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public String parseMessage(String textMsg) {
        String response = null;

        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start"))

            response = "";

        return response ;
    }
}