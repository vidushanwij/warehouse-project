package com.example.warehousemanagement.service;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;

@Service
public class FileReadServiceImpl implements FileReadService {

    public String text;
    public File directory ;

    public String read(){
        try{
            File file = new File("D://TransferConfirmation-48663477.pdf");
            PDDocument document = PDDocument.load(file);
            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();
            //Retrieving text from PDF document
            text = pdfStripper.getText(document);
            System.out.println(text);
            //Closing the document
            document.close();
        }
        catch(Exception e){
            System.out.println("Exception");
        }

        return text;
    }

    // have to call and test this
    @Override
    public void cleanDirectory() {
        directory=new File("/Users/Vidu/Documents/temp");
        try {
            FileUtils.cleanDirectory(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
