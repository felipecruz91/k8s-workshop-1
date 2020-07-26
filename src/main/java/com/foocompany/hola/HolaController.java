package com.foocompany.hola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public final class HolaController {

    @GetMapping
    public final String hola() throws UnknownHostException {
        return String.format("Handling request from pod %s. DB_USERNAME: %s DB_PASSWORD: %s\n", InetAddress.getLocalHost().getHostName(), System.getenv("DB_USERNAME"), System.getenv("DB_PASSWORD"));
    }
}
