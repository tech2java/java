package com.tech2java.java8.joda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 *
 * java.util.Date & SimpleDateFormatter are not thread safe.
 * Some problems can be overcome if we use Calendar - still that lead tp error-prone
 *
 * oracle integrated joda features in java8
 * java.time package
 * LocalDateTime.now()
 * LocalDateTime.of(y.m,d)
 * LocalDateTime.parse("year-month-day")
 *
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {


        //LocalDate
        LocalDate today=LocalDate.now();
        LocalTime time=LocalTime.now();

        //LocalTime time1=LocalTime.of(12,12,30);
        LocalDateTime localDateTime=LocalDateTime.of(today,time);

        System.out.println(localDateTime);

        //converting to LocalDate
        LocalDate localDate=localDateTime.toLocalDate();

        LocalTime localTime=localDateTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);

    }


}
