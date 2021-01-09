
package my_app.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String form() {
        return "form";
    }
}