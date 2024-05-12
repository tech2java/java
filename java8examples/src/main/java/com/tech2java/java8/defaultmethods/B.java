package com.tech2java.java8.defaultmethods;

public interface B {

    public default void m1(){
        System.out.println("B::m1()");
    }
}
