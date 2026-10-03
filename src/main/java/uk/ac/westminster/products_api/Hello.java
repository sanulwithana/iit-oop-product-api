package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController

class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from IIT!";
    }

    @GetMapping("/status")
    public String status() {
        return "API is running in v1.0" + " on " + LocalDateTime.now();
    }

    @GetMapping("/bye")
    public String bye() {
        return "Goodbye from IIT";
    }
}
