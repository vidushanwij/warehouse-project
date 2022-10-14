package com.example.warehousemanagement.repository;

import com.example.warehousemanagement.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbRunner implements CommandLineRunner {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {

    //itemRepository.save(new Item());

    }
}
