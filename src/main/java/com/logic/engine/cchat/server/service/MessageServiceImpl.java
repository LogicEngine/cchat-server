package com.logic.engine.cchat.server.service;

import com.logic.engine.cchat.server.api.MessageService;

import org.springframework.stereotype.Service;

/**
 * @author Vahagn Lazyan
 * @since 03.06.17
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public boolean send(int userId, String message) {
        return false;
    }
}
