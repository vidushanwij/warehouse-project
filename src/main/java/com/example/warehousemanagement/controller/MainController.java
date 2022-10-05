package com.example.warehousemanagement.controller;

import com.example.warehousemanagement.service.FileReadService;
import com.example.warehousemanagement.service.TextProcessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private  FileReadService fileReadService;
    private TextProcessService textProcessService;

    public MainController( FileReadService fileReadService, TextProcessService textProcessService){
        this.fileReadService=fileReadService;
        this.textProcessService=textProcessService;
    }

    @RequestMapping(value = "/start")
    public String readFile(){
        return fileReadService.read();
    }

    @RequestMapping(value = "/parse")
    public String parseText(){
        return textProcessService.textParser();
    }


}
