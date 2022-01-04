package my_app.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyJsonController {



    @RequestMapping(value="/book", method = RequestMethod.POST)
    public String get(@RequestBody String body) {
        return "hello :" + body;
    }



    @RequestMapping("/book2")
    public List<User> json() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 100; i++) {
            list.add(new User("tanaka" + i, i));
            System.out.println(list.get(i).getName() + ": " + list.get(i).getAge());
        }
        return list;
    }


}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}