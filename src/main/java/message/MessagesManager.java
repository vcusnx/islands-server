/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The Messenger Project.
 */

package message;

import user.User;


public interface MessagesManager {

    /**
     * Sends message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text message text
     */
    void send(long messageId, User user, String text);

    /**
     * Deletes message
     *
     * @param messageId message ID
     * @param user message from User
     */
    void delete(long messageId, User user);

    /**
     * Edits message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text new message text
     */
    void edit(long messageId, User user, String text);
}