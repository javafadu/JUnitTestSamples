package com.app.service;

import com.app.repository.MessageRepository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MessageService {

    private MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<String> getMessages() {
        try {
            return repository.getMessages();
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }

   public List<String> getMessagesWithLessThanFive() {
       try {
           return repository.getMessages().stream().filter(t->t.length()<5).collect(Collectors.toList());
       } catch (SQLException e) {
           return Arrays.asList();
       }
   }

   public void addMessage(String message) {
        repository.addMessage(message);
   }

   public void removeMessage(String message) {
        repository.removeMessage(message);
   }

}
