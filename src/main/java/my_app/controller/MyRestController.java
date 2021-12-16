package my_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @GetMapping("/get")
    public String get() {
        return "return get endpoint";
    }

}