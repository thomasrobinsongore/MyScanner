package com.thomas;

public class ToStringExample {

    private int day;
    private int month;
    private int year;

    public ToStringExample(int theDay, int theMonth, int theYear) {

        day = theDay;
        month = theMonth;
        year = theYear;

        System.out.printf("The constructor for this is %s\n", this);    //when 'this' is called, looks for toString method
    }

    public String toString() {

        return String.format("%d/%d/%d", day, month, year);

    }

}
