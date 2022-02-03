package com.modernjava.lamda;

public class HelloWorldLamda {

    public static void main(String[] args) {
        // implementing sayHelloWorld from the interface using lambda
        HelloWorldInterface helloWorldInterface = () ->{
            return "Hello World";
        };


        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
