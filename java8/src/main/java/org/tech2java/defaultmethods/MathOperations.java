package org.tech2java.defaultmethods;

public interface MathOperations {

    default void add(){
        System.out.println("Default add method!");
    }
}
