package com.example.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blog {
    @GetMapping(value = "/blog")
    public String blog(){
        return "blog";
    }
}
