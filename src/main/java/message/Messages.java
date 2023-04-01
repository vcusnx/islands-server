/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The Messenger Project.
 */

package message;

import user.User;


public class Messages implements MessagesManager {

    private final long messageId;
    private final long chatId;
    private final String userName;
    private final String messageText;

    /**
     * Constructor for Message class
     */
    public Messages() {
        this.chatId = getChatId();
        this.messageId = getMessageId();
        this.userName = getUserName();
        this.messageText = getMessageText();
    }

    /**
     * @return Chat ID
     */
    public long getChatId() {
        return chatId;
    }

    /**
     * @return Message ID
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * @return User name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return Message text
     */
    public String getMessageText() {
        return messageText;
    }

    @Override
    public void send(long messageId, User user, String text) {

    }

    @Override
    public void delete(long messageId, User user) {

    }

    @Override
    public void edit(long messageId, User user, String text) {

    }
}