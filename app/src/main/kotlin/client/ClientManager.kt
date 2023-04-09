/*
 * Copyright (c) Grigory "vcusnx" Markovich, ISLANDS TEAM, 2023.
 *
 *
 */

package client

interface ClientManager {

    /**
     * Connect to the server
     */
    fun connect(address: String)

    /**
     * Disconnect from server
     */
    fun disconnect()
}