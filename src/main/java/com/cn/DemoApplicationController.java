package com.cn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
    @RequestMapping("Hello")
    String hello() {
        return "Hello World!";
    }

}
