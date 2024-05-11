package com.tech2java.java7examples;

public class BinaryLiteralExample {

    public static void main(String[] args) {

        byte byteBinary=0b111;
        short shortBinary=0b001;
        int  intBinary=0b1111;
        long longBinary=0b111000111;

        System.out.println("byteBinary decimal value::"+byteBinary);
        System.out.println("shortBinary decimal value::"+shortBinary);
        System.out.println("intBinary decimal value::"+intBinary);
        System.out.println("longBinary decimal value::"+longBinary);

        var num=15;

        System.out.println("(intBinary==num)::"+(intBinary==num));
        System.out.println("shortBinary multiplication by 2::"+(shortBinary*2));



    }
}
