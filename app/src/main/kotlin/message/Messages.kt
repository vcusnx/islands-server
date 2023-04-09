/*
 * Copyright (c) Grigory "vcusnx" Markovich, ISLANDS TEAM, 2023.
 *
 *
 */

package message

import user.User

class Messages: MessagesManager {
    /**
     * Sends message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text message text
     */
    override fun send(messageId: Long, user: String, text: String) {
        TODO("Not yet implemented")
    }

    /**
     * Deletes message
     *
     * @param messageId message ID
     * @param user message from User
     */
    override fun delete(messageId: Long, user: User) {
        TODO("Not yet implemented")
    }

    /**
     * Edits message
     *
     * @param messageId message ID
     * @param user message from User
     * @param text new message text
     */
    override fun edit(messageId: Long, user: User, text: String) {
        TODO("Not yet implemented")
    }

}