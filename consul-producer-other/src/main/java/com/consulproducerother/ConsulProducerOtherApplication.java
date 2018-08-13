package com.consulproducerother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProducerOtherApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerOtherApplication.class, args);
    }
}
