// Copyright (c) Grigory "vcusnx" Markovich, 2023.
//
// The Messenger Project.

package server

/**
 * ### This interface has *3 methods*:
 * - Start()
 * - Shutdown()
 * - Restart()
 *
 * **`Start()`**: starts the server at **_localhost_** with port **_4850_**
 *
 * **`Shutdown()`**: shutdowns the server
 *
 * **`Restart()`**: restarts the server at **_localhost_** with port **_4850_**
 */
interface ServerManager {
    /**
     * Starts the server at **_localhost_** with port **_4850_**
     */
    fun start()

    /**
     * Shutdowns the server
     */
    fun shutdown()

    /**
     * Restarts the server at **_localhost_** with port **_4850_**
     */
    fun restart()
}