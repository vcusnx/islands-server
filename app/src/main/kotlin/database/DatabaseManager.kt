/*
 * Copyright (c) Grigory "vcusnx" Markovich, ISLANDS TEAM, 2023.
 *
 *
 */

package database

import java.sql.Connection

interface DatabaseManager {
    /**
     * Connect to database
     */
    fun connect(): Connection

    /**
     * Disconnect from server
     */
    fun disconnect(): Connection
}