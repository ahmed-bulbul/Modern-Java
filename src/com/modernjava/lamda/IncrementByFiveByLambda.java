package com.modernjava.lamda;

public class IncrementByFiveByLambda {

    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = (x) -> x+5;
        System.out.println(incrementByFiveInterface.incrementByFive(5));
    }
}
