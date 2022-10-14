package com.example.warehousemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WarehousemanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehousemanagementApplication.class, args);
    }

}
