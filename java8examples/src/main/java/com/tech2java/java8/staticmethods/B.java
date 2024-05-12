package com.tech2java.java8.staticmethods;

public class B implements  A{

    public static void m1(){
        System.out.println("B::m1()- Static method inside class B");
    }


    //from java8- static methods allowed in the interfaces - we can write main method
    public static void main(String[] args) {

        B b=new B();
        b.m1();

        A.m1();
        B.m1();

    }

}
