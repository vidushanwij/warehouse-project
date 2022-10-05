package com.example.warehousemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class TextProcessService {

    @Autowired
    FileReadService fileReadService;

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
