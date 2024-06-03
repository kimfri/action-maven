package dev.kimfri.actionmaven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStuffTest {

  @Test
  void testToString() {
    MyStuff myStuff = new MyStuff();
    assertEquals("This is MyStuff", myStuff.toString());
  }
}