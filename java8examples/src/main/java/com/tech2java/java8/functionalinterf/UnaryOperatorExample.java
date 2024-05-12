package com.tech2java.java8.functionalinterf;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Same methods as Function
 * We can mix Function and UnaryOperator
 * It's the child of Function
 */
public class UnaryOperatorExample {

    public static void main(String[] args) {

        Function<Integer,Integer> mulFunction=(x)->x*2;


        UnaryOperator<Integer> divFunction=(x)->x/2;

        //apply()
        System.out.println(mulFunction.apply(20));

        //andThen() -1st mulFunction then divFunction will be evaluated

        //Mixing Function and UnaryOperator
        System.out.println(mulFunction.andThen(divFunction).apply(10));//10

        //compose()- it's reverse of andThen
        //Mixing Function and UnaryOperator
        System.out.println(mulFunction.compose(divFunction).apply(100));//100

        //identity
        UnaryOperator<Integer> identityFunction=UnaryOperator.identity();
        System.out.println(identityFunction.apply(20));//20- Returns same value

    }
}
