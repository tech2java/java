package com.tech2java.java8.defaultmethods;

public class C implements A,B{


    @Override
    public void m1() {
        //Custom implementation
        System.out.println("Custom Implementation!!");

        //A.super.m1(); OR
        //B.super.m1();
    }
}
