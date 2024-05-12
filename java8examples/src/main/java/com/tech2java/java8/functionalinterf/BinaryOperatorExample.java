package com.tech2java.java8.functionalinterf;


import java.util.function.BinaryOperator;

/**
 * if inputs and return types are same then use BinaryOperator.
 * minBy
 * maxBy
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<Integer> addBinaryOperator=(x,y)->x+y;

        BinaryOperator<Integer> mulBinaryOperator=(x,y)->x*y;


        System.out.println(addBinaryOperator.apply(10,20));
        System.out.println(mulBinaryOperator.apply(10,20));

        //max
        BinaryOperator<Integer> maxBy=BinaryOperator.maxBy((x,y)->(x>y)?1:((x<y)?-1:0));

        BinaryOperator<Integer> maxBy1=BinaryOperator.maxBy((x,y)->
        {
            if(x>y)
                return 1;
                else if(x<y)
                    return -1;
                    else
                        return 0;
        });
        System.out.println(maxBy.apply(200,100));
        System.out.println(maxBy1.apply(300,100));

        //min
        BinaryOperator<Integer> minBy=BinaryOperator.minBy((x,y)->(x>y)?1:((x<y)?-1:0));
        System.out.println(minBy.apply(200,100));



    }
}
