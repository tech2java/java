package com.tech2java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Collections: stores the group of elements as a single entity
 * Streams: It processes the groups of data from the Collections
 *
 * list.stream();
 * Stream.of(..)
 * list.parallelStream()
 * Arrays.stream(..)
 * Stream.empty()
 * Stream.generate()
 * Stream.iterate()
 *
 */
public class SteamsExample {

    public static void main(String[] args) {

        //Creating a Stream from Collection or List

        List<String> technologies= Arrays.asList("java",".net","php");

        //stream from Collection/List - Prints the data ordered
        Stream<String> techStream1 =technologies.stream();
        techStream1.forEach(e->System.out.println(e));
        System.out.println("================");

        //Stream from of method
        Stream<String> techStream2=Stream.of("java",".net","php");
        techStream2.forEach(System.out::println);

        System.out.println("================");
        //It processes data parallel and prints the data randomly
        Stream<String> techStream3 =technologies.parallelStream();
        techStream3.forEach(System.out::println);


        System.out.println("=================");
        //Converting arrays to Stream
        int[] intArray={1,2,3};
        IntStream integerStream=Arrays.stream(intArray); //Arrays.stream(array,from,to)
        integerStream.forEach(System.out::println);

        //Creating empty Stream
        Stream<String> emptyStream=Stream.empty();
        System.out.println(emptyStream);

        //generate infinite stream of elements - suitable for stream of random elements.
        //Stream.generate()
        //Stream.iterate()

        //Stream.generate(new Random()::nextInt).forEach(System.out::println);
        //Stream.iterate(1, n->n+1).forEach(System.out::println);

    }
}
