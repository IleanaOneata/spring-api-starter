package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ileanaoneata on 23.04.2025
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "index.html";
    }
}
