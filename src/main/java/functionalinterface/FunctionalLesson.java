package main.java.functionalinterface;

import java.util.function.Function;

public class FunctionalLesson {

    public static void main(String[] args) {


    }

    @FunctionalInterface
    public interface Comparator<T> {

     public default Comparator<T> thenComparing(Comparator<T> cmp){
         return (p1,p2) -> compare(p1,p2) == 0 ? cmp.compare(p1,p2) : compare(p1,p2);
     }
     public default Comparator<T> thenComparing(Function<T, Comparable> f){
         return (p1,p2) -> -1;
     }

     public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
            return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
        }

        int compare(T t1, T t2);

    }
}
