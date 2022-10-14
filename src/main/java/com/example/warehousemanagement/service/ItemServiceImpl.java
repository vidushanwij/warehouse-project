package com.example.warehousemanagement.service;

import com.example.warehousemanagement.Model.Item;
import com.example.warehousemanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public Item save() {
       return itemRepository.save(new Item(22,"test","samplehandler"));
    }

    @Override
    public Item getItem(int key) {
        return itemRepository.findById(key).orElse(null);
    }
}
