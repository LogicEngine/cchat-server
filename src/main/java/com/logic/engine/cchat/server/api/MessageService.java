package com.logic.engine.cchat.server.api;

/**
 * @author Vahagn Lazyan
 * @since 03.06.17
 */
public interface MessageService {
    boolean send(int userId, String message);
}
