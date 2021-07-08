package com.HouseSwap.HouseSwap.dto;

import com.HouseSwap.HouseSwap.Model.Messages;

public class MessageDto {

    String username;
    String receiver;
    String message;

    public Messages convertMessage(){
        Messages messages= new Messages();
        messages.setUsername(username);
        messages.setReceiver(receiver);
        messages.setMessage(message);
        return messages;
    }
}
