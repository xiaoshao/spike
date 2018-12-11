package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerController {

    @GetMapping("/server/handler")
    @ResponseBody
    public String handler(){
        return "here is server";
    }
}
