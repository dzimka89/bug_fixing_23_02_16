package com.bugs.null_pointer_exceptions;

public class ExtendTest1 {

    public static void main(String[] args) {
        new Child();

    }
}

abstract class Parent {
    public Parent() {
        init();
    }

    public abstract void init();
}


class Child extends Parent {
    private String mTitle = null;

    public Child() {
        mTitle = "It' a test"; // If we want to see this message using only constructor
        System.out.println(mTitle.toString()); // or just delete .toString
    }

    public void init() {
        mTitle = "It' a test";
    }
}