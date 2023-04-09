/*
 * Copyright (c) Grigory "vcusnx" Markovich, ISLANDS TEAM, 2023.
 *
 *
 */

package message

import user.User

interface MessagesManager {
    /**
     * Sends message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text message text
     */
    fun send(messageId: Long, user: String, text: String)

    /**
     * Deletes message
     *
     * @param messageId message ID
     * @param user message from User
     */
    fun delete(messageId: Long, user: User)

    /**
     * Edits message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text new message text
     */
    fun edit(messageId: Long, user: User, text: String)
}