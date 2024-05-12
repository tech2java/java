package com.tech2java.java8.joda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * java.time.format
 *
 * DateTimeFormatter - it's ThreadSafe
 *
 * format()
 * parse()
 * offPattern()
 *
 */
public class DateFormatterExample {

    public static void main(String[] args) {

        LocalDate now=LocalDate.now();
        String basicISOFormat=now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(basicISOFormat);//20240512

        String localISODate=now.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localISODate);//2024-05-12

        System.out.println("===========================");
        LocalDate basicISODate=LocalDate.parse("20240512",DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(basicISODate);//2024-05-12

        LocalDate localISO=LocalDate.parse("2024-05-12",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localISO);//2024-05-12

        System.out.println("===========================");
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String localDateWithFormat=now.format(dateTimeFormatter);
        System.out.println(localDateWithFormat);//12/05/2024


        DateTimeFormatter germaDateTimeFormatter=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN);
        String germanFormat=now.format(germaDateTimeFormatter);
        System.out.println(germanFormat);//12. Mai 2024



    }

}
