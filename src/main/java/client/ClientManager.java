/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
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
