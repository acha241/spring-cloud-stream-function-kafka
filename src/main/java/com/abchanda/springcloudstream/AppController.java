package com.abchanda.springcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
public class AppController {

    @Autowired
    Consumer<Person> sendToInput;

    @GetMapping("/produce")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void setPerson(@RequestParam("name") String name){
        Person person = new Person(name, "23");

        sendToInput.accept(person);
    }
}
