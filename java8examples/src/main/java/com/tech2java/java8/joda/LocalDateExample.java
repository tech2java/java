package com.tech2java.java8.joda;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 *
 * java.util.Date & SimpleDateFormatter are not thread safe.
 * Some problems can be overcome if we use Calendar - still that lead tp error-prone
 *
 * oracle integrated joda features in java8
 * java.time package
 *
 * LocalDate.now()
 * LocalDate.of(y.m,d)
 * LocalDate.parse("year-month-day")
 *
 */
public class LocalDateExample {

    public static void main(String[] args) {


        //LocalDate
        LocalDate today=LocalDate.now();
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());

        LocalDate date=LocalDate.of(1985,10,12);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfWeek());

        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.get(ChronoField.DAY_OF_WEEK));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));

        System.out.println("=========================");
        LocalDate date2=LocalDate.parse("1985-10-12");
        System.out.println(date2.getDayOfWeek());



    }


}
