package com.logic.engine.cchat.server.controller;

import com.logic.engine.cchat.server.api.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vahagn Lazyan
 * @since 03.06.17
 */
@RestController
@RequestMapping(value = "/message", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MessageController {

    private final MessageService messageService;

    @Autowired
    private MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public boolean getCourseById(@PathVariable int id,
                                 @RequestBody String message) {

        return messageService.send(id, message);
    }
}
