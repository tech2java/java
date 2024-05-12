package com.tech2java.java8.functionalinterf;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 * get()
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> monthSupplier=()-> LocalDate.now().getDayOfMonth();
        System.out.println(monthSupplier.get());


        Supplier<String> weekSupplier=()-> LocalDate.now().getDayOfWeek().name();
        System.out.println(weekSupplier.get());


        Supplier<Double> randomSupplier=()-> Math.random();
        System.out.println(randomSupplier.get());


    }
}
