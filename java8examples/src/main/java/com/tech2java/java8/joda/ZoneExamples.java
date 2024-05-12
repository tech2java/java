package com.tech2java.java8.joda;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * ZoneId - replacement of java.util.TimeZone
 * ZonedDateTime
 *==================
 * ZoneOffset
 * OffsetDateTime - Recommended in coding
 */
public class ZoneExamples {


    public static void main(String[] args) {

        //ZoneId - replacement of java.util.TimeZone  and handled DST(Daylight Savings Time)
        //ZoneId- represents the TimeZone

        ZoneId india=ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaDateTime=ZonedDateTime.now(india);
        System.out.println("Time in india now:"+indiaDateTime);//2024-05-12T18:23:22.061878500+05:30[Asia/Kolkata]

        ZonedDateTime parisZonedDateTime=indiaDateTime.withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("time in Paris now:"+parisZonedDateTime);//2024-05-12T14:54:46.527642500+02:00[Europe/Paris]

        ZoneOffset indiaZonedOffSet=ZoneOffset.of("+05:30");
        OffsetDateTime indiaTimeWithOffset=OffsetDateTime.now(indiaZonedOffSet);

        System.out.println(indiaTimeWithOffset);//2024-05-12T18:26:51.062043400+05:30


        OffsetDateTime parisTime=indiaTimeWithOffset.withOffsetSameInstant(ZoneOffset.of("+01:00"));
        System.out.println(parisTime);

    }

}
