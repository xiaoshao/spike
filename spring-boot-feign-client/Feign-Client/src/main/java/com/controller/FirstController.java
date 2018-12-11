package com.controller;

import com.service.FeignServerProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Controller
public class FirstController {

    @Autowired
    private FeignServerProxyService feignServerProxyService;

    @GetMapping("/feignclient")
    @ResponseBody
    public String first() {
        String serverContent = feignServerProxyService.handler();
        return "this is client " + serverContent;
    }
}
