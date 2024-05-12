package com.tech2java.java8.methodref;


public class InstanceMethodRefByInstance {

    public static void main(String[] args) {

        MathOperation mathOperation=(x,y)->{
            System.out.println("The sum of input values by lambda..");
            return x+y;
        };
        System.out.println(mathOperation.add(10,20));

        //Creating Object
        InstanceMethodRefByInstance methodRefByInstance=new InstanceMethodRefByInstance();

        //Instance method Reference by Instance
        MathOperation mathOpByStaticMethodRef= methodRefByInstance::performAdd;

        System.out.println(mathOpByStaticMethodRef.add(10,20));

    }
    private int performAdd(int x, int y){
        System.out.println("The sum of input values by Instance method reference..");
        return x+y;
    }
}
