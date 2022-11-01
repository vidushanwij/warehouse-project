package com.example.warehousemanagement.serviceimpl;

import com.example.warehousemanagement.Model.Item;
import com.example.warehousemanagement.repository.ItemRepository;
import com.example.warehousemanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll() ;
    }
}
