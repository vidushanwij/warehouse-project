package com.example.warehousemanagement.controller;

import com.example.warehousemanagement.service.EmailDownloadService;
import com.example.warehousemanagement.service.FileReadService;
import com.example.warehousemanagement.service.TextProcessService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    String host = "pop.gmail.com";
    String port = "995";
    String userName = "onlyforprojectsvidu@gmail.com";
    String password = "sumysgdthxgdtxip";

    String saveDirectory = "E:/Attachment";


    private  FileReadService fileReadService;
    private TextProcessService textProcessService;
    private EmailDownloadService emailDownloadService;

    public MainController( FileReadService fileReadService, TextProcessService textProcessService, EmailDownloadService emailDownloadService){
        this.fileReadService=fileReadService;
        this.textProcessService=textProcessService;
        this.emailDownloadService=emailDownloadService;
    }

    @RequestMapping(value = "/start")
    public String readFile(){
        return fileReadService.read();
    }

    @RequestMapping(value = "/parse")
    public String parseText(){
        return textProcessService.textParser();
    }

    @RequestMapping(value = "/download")
    public void downloadEmail(){
        emailDownloadService.setSaveDirectory(saveDirectory);
        emailDownloadService.downloadEmailAttachments(host,port,userName,password);

    }


}
