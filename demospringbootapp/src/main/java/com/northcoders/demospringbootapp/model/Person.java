package com.northcoders.demospringbootapp.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String emailAddress;
    private String placeOfBirth;
    private String favouriteFood;
    private List<Person> peopleList = new ArrayList<>();


    public Person(String name,
                  int age,
                  String emailAddress,
                  String placeOfBirth,
                  String favouriteFood
    ) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.placeOfBirth = placeOfBirth;
        this.favouriteFood = favouriteFood;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
