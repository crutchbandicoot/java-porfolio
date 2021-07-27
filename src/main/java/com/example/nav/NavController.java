package com.example.nav;
// package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * NavController
 */
@Controller
public class NavController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/about")
    public String about(){
        return "about";
    }

    @RequestMapping(value = "/projects")
    public String projects(){
        return "projects";
    }



}