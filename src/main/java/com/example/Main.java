package com.example;

import data.Person;
import data.User;

import java.time.LocalDate;
import java.util.ArrayList;

import static data.User.Gender.male;

public class Main {
  public static void main(String[] args) {
    // simple JSON sample file + property inference
    var person = Person.fromSource();
    System.out.println(person.name);

    // simple JSON schema file + property inference
    var user = User.builder("Bob", "bob@email.com")
      .withGender(male)
      .withDate_of_birth(LocalDate.of(1978, 8, 18))
      .build();
    System.out.println(user.name);
    System.out.println(user.date_of_birth.year);

    // use custom method extension
    ArrayList<String> list = new ArrayList<>();
    list.myArrayListMethod();
  }
}
