package com.thomas;

import java.util.EnumSet;

public enum EnumExample {

    person1("Thomas", 22),
    person2("James", 34),
    person3("Steve", 43);

    private final String name;
    private final int age;

    EnumExample(String n, int a) {

        name = n;
        age = a;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        for(EnumExample example: EnumExample.values()) {

            System.out.printf("%s\t%s\t%s\t\n", example, example.getName(), example.getAge());
        }

    }
}
