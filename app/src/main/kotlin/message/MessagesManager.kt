/*
 * Copyright (c) 2023 Grigory "vcusnx" Markovich, ISLANDS TEAM
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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