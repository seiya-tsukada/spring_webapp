package my_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public String get() {
        return "return get endpoint";
    }

    @RequestMapping(value="/post", method = RequestMethod.POST)
    public String post(@RequestBody(required=false) String body) {
        if (body != null) {
            return "hello " + body + "!!";
        } else {
            return "hello!!";
        }
    }

}