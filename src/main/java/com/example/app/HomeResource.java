package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<h1>Hello Home</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Hello user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Hello admin</h1>");
    }

}