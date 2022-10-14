package com.example.warehousemanagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int itemNo;
    private String currentStage ;
    private String handlerName;

    public Item(int itemNo, String currentStage, String handlerName) {
        this.itemNo = itemNo;
        this.currentStage = currentStage;
        this.handlerName = handlerName;
    }

    public Item() {

    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

}
