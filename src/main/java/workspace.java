package main.java;

import java.util.stream.IntStream;

public class workspace {


    public static void main(String[] args) {

        fizzBuzz();
    }

    private static void fizzBuzz() {

        IntStream.range(1, 100).mapToObj(i ->
                i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz")
                        : i % 5 == 0 ? "BUzz" : i).forEach(System.out::println);



    }


}
