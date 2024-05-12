package com.tech2java.java8.streams;

import com.tech2java.java8.methodref.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * reduce()
 * collect()
 * collectAndThen()
 * groupingBy()
 * partitioningBy()
 * sort()
 * =======
 * //toCollection()
 * //toMap()
 * //counting()
 * //joining()
 * //maxBy()
 * //minBy()
 * //reducing()
 * ====
 * Parallel Streams
 *
 */
public class SteamTerminalOpExample {

    public static void main(String[] args) {

        //sum of n numbers.
        //reduce
        int sum=Stream.iterate(0,n->n+1).limit(10).reduce(0,(x,y)->x+y);
        System.out.println("SUM="+sum);

        //collect
        List<String> list =Arrays.asList("java","php",".net","angular");
        System.out.println(list.stream().filter(e->e.contains("a")).collect(Collectors.toList()));
        System.out.println(list.stream().filter(e->e.contains("a")).collect(Collectors.toSet()));

        //CollectingAndThen
        //Get the max product name
        List<Product> productList=Arrays.asList(new Product("Apple",100),
                                            new Product("Samsung",3000),
                                            new Product("Redme",5000));

        String maxPrice=productList.stream().collect(Collectors.
                collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                                  (Optional<Product> product)-> product.isPresent()?product.get().getName():"None"));
        System.out.println(maxPrice);

        //GroupBy price
        List<Product> productList2=Arrays.asList(new Product("Apple",100),
                new Product("Samsung",3000),
                new Product("Vivo",3000),
                new Product("Oppo",1500),
                new Product("Redme",100));

        Map<Integer,List<Product>> groupMap=productList2.stream().collect(Collectors.groupingBy(Product::getPrice));
        System.out.println("groupMap::"+groupMap);

        //partitionedBy price
        List<Product> productList3=Arrays.asList(new Product("Apple",100),
                new Product("Samsung",3000),
                new Product("Vivo",3000),
                new Product("Oppo",1500),
                new Product("Redme",100));


        Map<Boolean,List<Product>> partitionedMap=productList3.stream().collect(Collectors.partitioningBy(p->p.getPrice()>1500));
        System.out.println("partitionedMap::"+partitionedMap);

        //sort elements   Chaining
        //stream->filter->map->sort->collect --> Stream pipeline

        List<Integer> unsortedList=Arrays.asList(10,18,34,85,62,67,84,12);

        List<Integer> sortedList=unsortedList.stream().filter(e->e%2==0).map(e->e*2).sorted().collect(Collectors.toList());
        System.out.println(sortedList);







    }
}
