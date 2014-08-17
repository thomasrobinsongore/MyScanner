package com.thomas;


public class Apple {

    private String appleName;

    public Apple(String name) {

        appleName = name;

    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public void simpleMessage(String string){

        System.out.println("This is the Apple class, your string is " + string);

    }

}
