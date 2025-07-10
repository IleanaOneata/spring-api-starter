package com.codewithmosh.store.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ileanaoneata on 06.06.2025
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Admin!";
    }
}
