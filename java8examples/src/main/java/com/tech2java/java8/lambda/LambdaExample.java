package com.tech2java.java8.lambda;

public class LambdaExample {
    int sum=0;


    public static void main(String[] args) {
        //new LambdaExample().sum();
        new LambdaExample().add();
    }


    public void sum(){

        int tempSum=0;
        ArithmeticOperation operation=(x,y)->{
            int sum=0;
            //Variable used in lambda expression should be final or effectively final
            //tempSum=10; CompileTime Error
            System.out.println("the sum inside lambda is::"+sum);
            this.sum=x+y;
            return this.sum;
        };

        System.out.println("Addition::"+operation.add(10,20));
    }

    public void add(){
        ArithmeticOperation operation=(x,y)->{
            return x+y;
        };

        System.out.println("Addition::"+operation.add(10,20));
    }

}
