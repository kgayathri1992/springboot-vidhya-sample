package my.example.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import my.example.models.Hello;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    private static final String TEMPLATE = "Hello Springboot, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Hello getHello(
            @PathVariable String name) {
        // Instantiate the next Hello
        Hello hello = new Hello(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
        // Return the next Hello
        return hello;
    }
}
