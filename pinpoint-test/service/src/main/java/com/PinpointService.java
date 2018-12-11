package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@SpringBootApplication
@Controller
public class PinpointService {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(PinpointService.class, args);
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
