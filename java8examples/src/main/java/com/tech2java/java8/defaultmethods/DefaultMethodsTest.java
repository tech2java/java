package com.tech2java.java8.defaultmethods;

public class DefaultMethodsTest {

    public static void main(String[] args) {

        //Test default methods
        DefaultMethodImpl defaultMethodImpl=new DefaultMethodImpl();
        int result=defaultMethodImpl.sum(10,20);
        System.out.println("result::"+result);

    }
}
