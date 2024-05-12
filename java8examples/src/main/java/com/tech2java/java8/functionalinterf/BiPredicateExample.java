package com.tech2java.java8.functionalinterf;

import java.util.function.BiPredicate;

/**
 * methods same as Predicate
 * It takes 2 params
 */
public class BiPredicateExample {


    public static void main(String[] args) {


        BiPredicate<Integer,Integer> evenPredicate=(x,y)->(x+y)%2==0;

        BiPredicate<Integer,Integer> greaterThanPredicate=(x,y)->(x+y)>50;

        System.out.println(evenPredicate.test(10,20));

        System.out.println(greaterThanPredicate.test(10,20));

        System.out.println(evenPredicate.and(greaterThanPredicate).test(60,20));











    }



}
