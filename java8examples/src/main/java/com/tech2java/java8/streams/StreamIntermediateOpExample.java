package com.tech2java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * map()
 * flatMap()
 * filter()
 * limit()
 * skip()
 */

public class StreamIntermediateOpExample {

    public static void main(String[] args) {

        List<String> tech= Arrays.asList("java",".net","php");

        //map()
        Stream<String> techStream =tech.stream();
        techStream.map(e->e.toUpperCase()).forEach(System.out::println);

        //IllegalStateException: stream has already been operated upon or closed
        //techStream.forEach(System.out::println);

        System.out.println("==========================");
        //If we ended up with multiple streams after post map method.
        //to flatten the multiple Streams to a single Stream
        String[] strArray={"java","php"};
        Stream<String> arrayStream=Arrays.stream(strArray);
        //arrayStream.forEach(System.out::println);
         arrayStream.map(str->str.split(""))
                 //.map(Arrays::stream)
                 .flatMap(Arrays::stream)
                 .forEach(System.out::println);

        //filter
        tech.stream().filter(e->e.contains("a")).forEach(System.out::println);

        System.out.println("==========LIMIT=====================");
        //limit
        tech.stream().limit(2).forEach(System.out::println);

        //limiting to 10 numbers.
        //Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        Stream.generate(
                ()->{
                 Random r=new Random();
                 return r.nextInt();
                }
        ).limit(10).forEach(System.out::println);


        System.out.println("===========SKIP====================");
        //skip - discards the first n elements
        tech.stream().skip(1).forEach(System.out::println);

        Stream.iterate(1,n->n+1).skip(5).limit(10).forEach(System.out::println);


    }
}
