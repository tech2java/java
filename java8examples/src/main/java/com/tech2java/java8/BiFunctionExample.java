package com.tech2java.java8;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * methods same as Function
 * It takes 2 params as input and returns
 */
public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> addBiFunction=(x,y)->x+y;
        BiFunction<Integer,Integer,Integer> mulBiFunction=(x,y)->x*y;

        Function<Integer,Integer> function=(x)->x/2;

        System.out.println(addBiFunction.apply(10,20));
        System.out.println(mulBiFunction.apply(10,20));

        //expecting return as a Function
        System.out.println(addBiFunction.andThen(function).apply(100,2));






    }
}
