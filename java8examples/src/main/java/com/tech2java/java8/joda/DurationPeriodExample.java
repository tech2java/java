package com.tech2java.java8.joda;

import java.time.*;

/**
 * Period
 * Duration
 * Instant
 */
public class DurationPeriodExample {

    public static void main(String[] args) {


        //finding the difference between two dates
        LocalDate date=LocalDate.of(1985,10,12);
        LocalDate today=LocalDate.now();
        Period period=Period.between(date,today);
        System.out.println("Years::"+period);//P38Y7M

        //Can add days,months and years.====

        //Finding the difference between two times.
        LocalTime now=LocalTime.now();
        LocalTime time=LocalTime.of(8,30,50);
        Duration duration=Duration.between(time,now);
        System.out.println(duration);//PT9H27M43.3988897S

        //finding the difference between two dates with time
        LocalDateTime localDateTimeNow=LocalDateTime.now();
        LocalDateTime localDateTime=LocalDateTime.of(date,LocalTime.of(12,34,44));
        Duration duration1=Duration.between(localDateTime,localDateTimeNow);
        System.out.println(duration1);//PT338213H28M14.138558S

        //for machines the time is calculated based on number of seconds passed from the
        // Unix epoch time set by convention to midnight of january 1, 1970,UTC.

        Instant instant=Instant.now();
        System.out.println(instant);//It prints UTC time now

        Instant instant1=Instant.ofEpochSecond(6);
        System.out.println(instant1);//1970-01-01T00:00:06Z (it adds 6 seconds to january 1, 1970,UTC)

    }
}
