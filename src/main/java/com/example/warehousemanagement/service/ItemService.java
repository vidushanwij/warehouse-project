package com.example.warehousemanagement.service;

import com.example.warehousemanagement.Model.Item;

public interface ItemService {

    Item save();
    Item getItem(int key);
}
