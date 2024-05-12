package com.tech2java.java8.joda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 *
 * java.util.Date & SimpleDateFormatter are not thread safe.
 * Some problems can be overcome if we use Calendar - still that lead tp error-prone
 *
 * oracle integrated joda features in java8
 * java.time package
 * LocalTime.now()
 * LocalTime.of(y.m,d)
 * LocalTime.parse("year-month-day")
 *
 */
public class LocalTimeExample {

    public static void main(String[] args) {


        //LocalDate
        LocalTime timeNow=LocalTime.now();
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());

        LocalTime time=LocalTime.of(12,10,12);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());


        System.out.println("=========================");
        LocalTime time2=LocalTime.parse("12:23:45");
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());



    }


}
