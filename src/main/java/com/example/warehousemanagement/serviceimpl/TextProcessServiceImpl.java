package com.example.warehousemanagement.serviceimpl;

import com.example.warehousemanagement.service.TextProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class TextProcessServiceImpl implements TextProcessService {

    @Autowired
    FileReadServiceImpl fileReadService;

    public String textParser(){

        String text = fileReadService.text;
        String processed= "";

        Pattern pattern = Pattern.compile("Amount : ");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            processed= text.substring(matcher.end()).trim();
        }
        String[] arrOfStr = processed.split(" ", 2);
        System.out.println(Arrays.toString(arrOfStr));

        String valueOne= arrOfStr[0];

        System.out.println(valueOne);
        return valueOne;
    }

}
