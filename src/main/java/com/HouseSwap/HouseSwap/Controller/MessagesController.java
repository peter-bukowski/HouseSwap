package com.HouseSwap.HouseSwap.Controller;


import com.HouseSwap.HouseSwap.Model.Messages;
import com.HouseSwap.HouseSwap.Repository.IMessageRepository;
import com.HouseSwap.HouseSwap.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/messages")
public class MessagesController {

    @Autowired
    IMessageRepository messageRepository;

    @PostMapping
    public Messages createMessage(@RequestBody Messages messages){
        return messageRepository.save(messages);
    }

    @GetMapping("allmessages")
    public List<Messages> getMessages(){
        return messageRepository.findAll();
    }
}
