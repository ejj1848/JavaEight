package main.java.functionalinterface;

import java.util.Comparator;
import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {

        Comparator<Person> cmpAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpF = (p1,p2) -> p2.getFirstName().compareTo(p1.getFirstName());
        Comparator<Person> cmpL = (p1,p2) -> p2.getLastName().compareTo(p1.getLastName());

        Function<Person,Integer> f1 = p -> p.getAge();
        Function<Person,String> f2 = p -> p.getLastName();
        Function<Person,String> f3 = p -> p.getFirstName();


        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);
        Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);

        Comparator<Person> cmp= cmpPersonAge.thenComparing(cmpPersonLastName).thenComparing(cmpPersonFirstName);
    }
}
