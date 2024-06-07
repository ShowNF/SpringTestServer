package com.IWI.SpringTest.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MainController {

    @GetMapping("/")
    public String main(){
        return "Spring Test Server On";
    }

    @GetMapping("/test")
    public String test(){
        return "!!!!Spring Test Server Test API!!!!";
    }
}
