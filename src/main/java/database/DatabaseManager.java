/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The Messenger Project.
 */

package database;

import java.sql.Connection;


public interface DatabaseManager {

    /**
     * @return Connection to the server
     */
    Connection connect();

    /**
     * @return Disconnection from server
     */
    Connection abortConnect();
}
