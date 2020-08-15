package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Hello world - springboot-appengine-standard! ";
    }
    @RequestMapping(path="hello")
    public String sayhello() {
        return "This is a hello controller with gradle 2.0!";
    }
}
