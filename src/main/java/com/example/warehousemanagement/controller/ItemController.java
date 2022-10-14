package com.example.warehousemanagement.controller;

import com.example.warehousemanagement.Model.Item;
import com.example.warehousemanagement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value ="/add", method = RequestMethod.GET)
    public Item addItem(){
        return itemService.save();
    }

    @GetMapping("{key}")
    public Item getItem(@PathVariable int key){
        return itemService.getItem(key);
    }


}
