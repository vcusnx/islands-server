/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The Messenger Project.
 */

package client;


public interface ClientManager {

    /**
     * Connect to server
     */
    void connect();

    /**
     * Disconnect from server
     */
    void disconnect();
}
