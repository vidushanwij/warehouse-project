package com.example.warehousemanagement.controller;

import com.example.warehousemanagement.Model.Item;
import com.example.warehousemanagement.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    String host = "pop.gmail.com";
    String port = "995";
    String userName = "onlyforprojectsvidu@gmail.com";
    String password = "sumysgdthxgdtxip";

    String saveDirectory = "E:/Attachment";


    private FileReadService fileReadService;
    private TextProcessServiceImpl textProcessServiceImpl;
    private AttachmentDownloadServiceImpl attachmentDownloadServiceImpl;


    public MainController(FileReadServiceImpl fileReadServiceImpl, TextProcessServiceImpl textProcessServiceImpl, AttachmentDownloadServiceImpl attachmentDownloadServiceImpl){
        this.fileReadService = fileReadServiceImpl;
        this.textProcessServiceImpl = textProcessServiceImpl;
        this.attachmentDownloadServiceImpl = attachmentDownloadServiceImpl;
    }


    @RequestMapping(value = "/start")
    public String readFile(){
        return fileReadService.read();
    }

    @RequestMapping(value = "/parse")
    public String parseText(){
        return textProcessServiceImpl.textParser();
    }

    @Scheduled(fixedRate = 30000)
    @RequestMapping(value = "/download")
    public void downloadEmail(){
        attachmentDownloadServiceImpl.setSaveDirectory(saveDirectory);
        attachmentDownloadServiceImpl.downloadEmailAttachments(host,port,userName,password);

    }
}
