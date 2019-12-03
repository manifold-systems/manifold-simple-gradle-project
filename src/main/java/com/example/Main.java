package com.example;

import data.Person;
import data.User;

import java.time.LocalDate;

import static data.User.Gender.male;

public class Main {
  public static void main(String[] args) {
    // simple JSON sample file
    var person = Person.fromSource();
    System.out.println(person.getName());

    // simple JSON schema file
    var user = User.builder("Bob","bob@email.com")
      .withGender(male)
      .withDate_of_birth(LocalDate.of(1978, 8, 18))
      .build();
    System.out.println(user.getName());
    System.out.println(user.getDate_of_birth().getYear());
  }
}
