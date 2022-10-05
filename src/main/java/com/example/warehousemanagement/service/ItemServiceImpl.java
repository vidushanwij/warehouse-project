package com.example.warehousemanagement.service;

import com.example.warehousemanagement.Model.Item;
import com.example.warehousemanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
       return itemRepository.save(item);
    }
}
