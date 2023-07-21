package com.yavor.springboot.demo.firstapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${book.title}")
    private String bookName;

    @Value("${book.authorname}")
    private String authorName;

    // expose "/" that return "Hello World" plus the current time
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!" + " Time on server is: " + java.time.LocalDateTime.now() + "book name is: " + bookName +
                " and book author name is: " + authorName;
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // Expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public  String getDailyFortune() {
        return "Today is your lucky day!";
    }

}
