package org.example.web;

import com.sun.net.httpserver.HttpServer;
import lombok.SneakyThrows;
import org.example.Applicationable;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebApplication implements Applicationable {

    @SneakyThrows
    @Override
    public void run() {
        HttpServer httpServer = null;
        try {
            httpServer = HttpServer.create(new InetSocketAddress("localhost",8080),1);
            httpServer.createContext("/calculate",new OperationHttpHandler());

            httpServer.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
