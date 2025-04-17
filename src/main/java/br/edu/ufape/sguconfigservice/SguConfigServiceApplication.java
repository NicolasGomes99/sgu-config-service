package br.edu.ufape.sguconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SguConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SguConfigServiceApplication.class, args);
    }

}
