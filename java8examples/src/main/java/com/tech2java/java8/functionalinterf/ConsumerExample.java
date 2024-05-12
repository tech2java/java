package com.tech2java.java8.functionalinterf;

import java.util.function.Consumer;

/**
 * accept()
 * andThen()
 */
public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> consumer1=x-> System.out.println(x.toUpperCase());
        consumer1.accept("java");

        Consumer<String> consumer2=x-> System.out.println(x);

        consumer2.andThen(consumer1).accept("hi,how are you!");




    }
}
