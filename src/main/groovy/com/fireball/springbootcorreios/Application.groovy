package com.fireball.springbootcorreios;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class Application {

    @RequestMapping("/")
    String home() {
        "hello"
    }

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }
}