package com.tech2java.java8.functionalinterf;

import java.util.function.Function;

/**
 * apply()
 * andThen()
 * compose()
 * identity()
 */
public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer,Integer> mulFunction=(x)->x*2;
        Function<Integer,Integer> divFunction=(x)->x/2;

        //apply()
        System.out.println(mulFunction.apply(20));

        //andThen() -1st mulFunction then divFunction will be evaluated
        System.out.println(mulFunction.andThen(divFunction).apply(10));//10

        //compose()- it's reverse of andThen
        System.out.println(mulFunction.compose(divFunction).apply(100));//100

        //identity
        Function<Integer,Integer> identityFunction=Function.identity();
        System.out.println(identityFunction.apply(20));//20- Returns same value

    }
}
