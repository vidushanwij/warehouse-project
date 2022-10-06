package com.example.warehousemanagement.service;

public interface AttachmentDownloadService {

    void setSaveDirectory(String dir);
    void downloadEmailAttachments(String host, String port,
                                  String userName, String password);
}
