package uk.co.tuffdev.springbootcicdtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String test() {
        return "Hello from API.";
    }
}
