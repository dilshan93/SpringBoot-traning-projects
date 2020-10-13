package com.dilshan.rentcloud.configserverremorte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerRemorteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerRemorteApplication.class, args);
    }

}
