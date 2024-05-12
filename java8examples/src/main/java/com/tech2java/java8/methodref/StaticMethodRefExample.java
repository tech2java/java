package com.tech2java.java8.methodref;


public class StaticMethodRefExample {

    public static void main(String[] args) {

        MathOperation mathOperation=(x,y)-> x+y;
        System.out.println(mathOperation.add(10,20));

        //Static method Reference
        MathOperation mathOpByStaticMethodRef=StaticMethodRefExample::performAdd;
        System.out.println(mathOpByStaticMethodRef.add(10,20));

    }
    private static int performAdd(int x, int y){
        return x+y;
    }
}
