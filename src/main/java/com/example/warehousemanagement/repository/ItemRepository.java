package com.example.warehousemanagement.repository;

import com.example.warehousemanagement.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    Item save(Item item);
}
