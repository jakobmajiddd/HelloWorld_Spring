package com.example.helloworldspring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    // localhost:8080/hello
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

    // localhost:8080/input?name=jakob
    @GetMapping("/input")
    public String input(@RequestParam String name) {
        return "Hello " + name;
    }
    // localhost:8080/erdetfredag.dk
    @GetMapping("/erdetfredag.dk")
    public String fredag() {
        return "Det er ikke Fredag";
    }

}
