package com.example.warehousemanagement.service;

import com.example.warehousemanagement.Model.Item;

import java.util.List;

public interface ItemService {

    Item save();
    Item getItem(int key);
    List<Item> getAllItems();
}
