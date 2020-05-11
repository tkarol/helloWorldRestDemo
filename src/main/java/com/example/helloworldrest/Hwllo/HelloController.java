package com.example.helloworldrest.Hwllo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld1")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hellotyler-bean")
    public userDetails helloWorldBean(){
        return new userDetails("tyler", "Karol", "leesburg");
    }
}
