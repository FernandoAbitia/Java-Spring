package com.kuroda.mx.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kuroda.mx.springdata"})
public class ClientControlSdApplication {

    public static void main(String[] args) {
    	System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ClientControlSdApplication.class, args);
    }
}
