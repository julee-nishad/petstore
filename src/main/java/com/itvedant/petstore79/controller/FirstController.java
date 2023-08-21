package com.itvedant.petstore79.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class FirstController {
    @RequestMapping("/message")
    @ResponseBody 
    // this annotation will serialise/convert the string data in JSON
    public String getMessage(){
        // we are getting the error here
        // because controller was expecting the name of some html file
        // but we don't want to send some html file as response
        // rather we want to send the string data embedded as
        return "welcome to REST API";

    

    }

}
