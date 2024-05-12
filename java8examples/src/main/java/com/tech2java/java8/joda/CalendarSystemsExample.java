package com.tech2java.java8.joda;

import java.time.chrono.HijrahDate;

/**
 * ThaiBuddhistDate
 * MinguoDate
 * JapaneseDate
 * HijrahDate(Islamic)
 *
 */
public class CalendarSystemsExample {

    public static void main(String[] args) {


        HijrahDate todayIslamic=HijrahDate.now();
        System.out.println("Islamic date for today="+todayIslamic);//Hijrah-umalqura AH 1445-11-04
    }
}
