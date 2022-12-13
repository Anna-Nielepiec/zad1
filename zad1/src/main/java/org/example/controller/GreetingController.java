package org.example.controller;

import org.example.domain.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/zwierzeta")
    public List<Greeting> getGreeting() {

        Greeting krowa = new Greeting(3l,"krowa");

        Greeting swinia = new Greeting();
        swinia.setId(2l);

        return toList(krowa);
    }

    @PostMapping("/zwierzeta")
    public boolean postGreeting() {


        return true;
    }

    private List<Greeting> toList(Greeting... greetings) {
        return List.of(greetings);
    }
    private List<Greeting> toList(Greeting gr1,  Greeting gr2) {
        List<Greeting> zwierzeta = new ArrayList();
        zwierzeta.add(gr1);
        zwierzeta.add(gr2);
        return zwierzeta;
    }
}
