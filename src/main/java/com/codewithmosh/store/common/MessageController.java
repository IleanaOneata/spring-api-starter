package com.codewithmosh.store.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ileanaoneata on 23.04.2025
 */

@RestController
public class MessageController {

    @RequestMapping("/hello")
    public String sayHello() {
        return new Message("Hello World!").getMessage();
    }
}
