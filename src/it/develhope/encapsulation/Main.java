package it.develhope.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Input in this order: name, surname, height and age.");

        Person person = new Person();
        person.setName(s.nextLine());
        person.setSurname(s.nextLine());
        person.setHeight(Math.floor(Double.parseDouble(s.nextLine()) * 100 / 100));
        person.setAge(Integer.parseInt(s.nextLine()));

        System.out.println(person);
    }
}
