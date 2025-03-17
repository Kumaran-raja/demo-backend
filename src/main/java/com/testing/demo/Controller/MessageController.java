package com.testing.demo.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class MessageController {
    @GetMapping("/msg")
    public String getMessage() {
        return "Hello from Spring Boot!";
    }
}
