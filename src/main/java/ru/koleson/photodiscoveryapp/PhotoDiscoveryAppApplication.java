package ru.koleson.photodiscoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableEurekaServer
@SpringBootApplication
public class PhotoDiscoveryAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoDiscoveryAppApplication.class, args);
    }

}
