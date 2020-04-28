package com.example;

import data.Person;
import data.User;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static data.User.Gender.male;
import static org.junit.Assert.assertEquals;

public class TestMe {
  @Test
  public void simpleExtensionTest()
  {
    ArrayList<String> list = new ArrayList<>();
    list.myArrayListMethod();
  }

  @Test
  public void simplePersonTest() {
    Person person = Person.fromSource();
    assertEquals("Scott", person.getName());
  }

  @Test
  public void simpleUserTest() {
    User user = User.builder("Bob", "bob@email.com")
      .withGender(male)
      .withDate_of_birth(LocalDate.of(1978, 8, 18))
      .build();
    assertEquals("Bob", user.getName());
    assertEquals(1978, user.getDate_of_birth().getYear());
  }
}
