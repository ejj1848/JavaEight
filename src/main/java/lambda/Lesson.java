package main.java.lambda;


import java.util.function.Predicate;


public class Lesson {

    public static void main(String[] args) {

        Predicate<String> p = s -> s.length() > 20;


    }
}