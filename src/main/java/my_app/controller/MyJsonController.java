package my_app.controller;

import my_app.dto.User;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyJsonController {

    @RequestMapping(value="/user/list", method = RequestMethod.GET)
    public List<User> json() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            list.add(new User("suzuki" + i, i));
            System.out.println(list.get(i).getName() + ": " + list.get(i).getAge());
        }
        return list;
    }
}