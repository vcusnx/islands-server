/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 */

package server;

import java.io.IOException;


/**
 * <h3>This interface has <b>3 methods</b>:</h3>
 * <ul>
 *     <li><i>Start()</i></li>
 *     <li><i>Shutdown()</i></li>
 *     <li><i>Restart()</i></li>
 * </ul>
 * <hr>
 *
 * <p><i>Start(): starts the server at <b>localhost</b> with port <b>4850</b></i></p>
 * <p><i>Shutdown(): shutdowns the server</i></p>
 * <p><i>Restart(): restarts the server at <b>localhost</b> with port <b>4850</b></i></p>
 */
public interface ServerManager {

    /**
     * <p><i>Starts the server at <b>localhost</b> with port <b>4850</b></i></p>
     */
    void Start() throws IOException;

    /**
     * <p><i>Shutdowns the server</i></p>
     */
    void Shutdown();

    /**
     * <i>Restarts the server at <b>localhost</b> with port <b>4850</b></i></p>
     */
    void Restart();
}
