/*
 * Copyright (c) Grigory "vcusnx" Markovich, 2023.
 *
 * The Messenger Project.
 */

package server;


import helpers.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author vcusn
 * @version 1.0
 */
public class Server implements ServerManager {

    ServerSocket serverSocket;
    Socket clientSocket;
    BufferedReader in;
    PrintWriter out;

    /**
     * <p><i>Starts the server at <b>localhost</b> with port <b>4850</b></i></p>
     */
    @Override
    public void Start() throws IOException {
        serverSocket = new ServerSocket(Constants.SERVER_PORT);
        serverSocket.accept();

        
    }

    /**
     * <p><i>Shutdowns the server</i></p>
     */
    @Override
    public void Shutdown() {

    }

    /**
     * <i>Restarts the server at <b>localhost</b> with port <b>4850</b></i></p>
     */
    @Override
    public void Restart() {

    }
}
