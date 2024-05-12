package com.tech2java.java8.functionalinterf;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * java.util.function
 * Only 1 abstract method
 * any number of default,static and private methods
 *
 * test()
 * and()
 * or()
 * negate()
 * isEqual()
 */
public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> predicate=(x)-> x>900;
        System.out.println(predicate.test(12));

        Predicate<Integer> evenPredicate=i->i%2==0;
        System.out.println(evenPredicate.test(34));

        //and
        System.out.println(predicate.and(evenPredicate).test(3000));

        //or
        System.out.println(predicate.or(evenPredicate).test(31));

        //negate
        System.out.println(evenPredicate.negate().test(31));

        //isEqual() static method
        Predicate<String> strPredicate=Predicate.isEqual("tech2java");
        System.out.println(strPredicate.test("tech2java"));

        //Predicate in Collections & Streams
        List<Integer> intList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect=intList.stream().filter(x->x%2==0).collect(Collectors.toList());

        System.out.println(collect);
    }
}
