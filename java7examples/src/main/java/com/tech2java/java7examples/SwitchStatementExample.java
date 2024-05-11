package com.tech2java.java7examples;

public class SwitchStatementExample {

    public static void main(String[] args) {

        String lang="java";
        switch (lang){

            case "microservices": case "java": case "spring":{
                System.out.println("Learning java technologies..");
                break;
            }

            case ".net":{
                System.out.println("Learning .net technologies..");
                break;

            }
            default:{
                System.out.println("Invalid lang..");
            }
        }

    }



}
