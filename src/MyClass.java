public class MyClass {

  public static void main(String[] args) {
    System.out.println("Hello, this is my first Java aplication");
    // A variable is a "box" that contains a information, and can be revaluated
    // int year = 2022;
    // year = 2023;

    // A final string means a string that can't be revaluated
    // final String BR = "Brazil";
    // final double PI = 3.14;
    String firstName = "Eduardo";
    String surName = "Almeida";

    String completeName = completeName(firstName, surName);
    System.out.println(completeName);
  }

  public static String completeName(String firstName, String surName) {
    return firstName.concat(" ").concat(surName);
  }
}
