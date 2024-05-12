package com.tech2java.java8.methodref;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefByClassType {

    public static void main(String[] args) {

        List<String> list =Arrays.asList("java",".net","php","AI");
        list.forEach(e->System.out.println(e));

        //System.out::println - it does same
        list.forEach(System.out::println);
    }
}
