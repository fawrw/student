package com.vipkid.controller;

import com.vipkid.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.soap.Addressing;

@Controller
public class HelloWorldController {
    @Autowired
    private Person person;
    @GetMapping("/")
    @ResponseBody
    public Person Hello(){
        return person;
    }
}
