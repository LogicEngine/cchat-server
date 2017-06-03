package com.logic.engine.cchat.server.service;

import com.logic.engine.cchat.server.api.MessageService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Vahagn Lazyan
 * @since 03.06.17
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageServiceTest {

    private MessageService messageService;

    public MessageServiceTest() {
        this.messageService = new MessageServiceImpl();
    }

    @Test
    public void sendMessageTest() {
        assert !this.messageService.send(1, "text");
    }
}
