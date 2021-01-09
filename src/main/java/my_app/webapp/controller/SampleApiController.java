
package my_app.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleApiController {

    @RequestMapping("/sapi")
    public String sampleapi() {
        return "api";
    }
}