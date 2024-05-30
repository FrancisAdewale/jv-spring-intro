package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.dao.CityDao;
import com.northcoders.demospringbootapp.model.Person;
import com.northcoders.demospringbootapp.model.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello there!";
    }

    @GetMapping("/people")
    public List<Person> getPeople()  {
        List<Person> peopleList = List.of(
                new Person("franc",1,"john@hotmail.com","UK","Pizza"),
                new Person("james",2,"john@hotmail.com","UK","Pizza"),
                new Person("mike",3,"john@hotmail.com","UK","Pizza"),
                new Person("leon",4,"john@hotmail.com","UK","Pizza"),
                new Person("jay",5,"john@hotmail.com","UK","Pizza"),
                new Person("danny",6,"john@hotmail.com","UK","Pizza")
        );

        return peopleList;

    }

    @RequestMapping("/city/{name}")
    public String getCityCoordinates(@PathVariable("name") String name) {
        var data = CityDao.cityDAO(name);
        return data.results.get(0).latitude + " " + data.results.get(0).longitude;

    }


}
