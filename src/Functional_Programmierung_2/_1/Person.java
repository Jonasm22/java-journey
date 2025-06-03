package Functional_Programmierung_2._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Person {

    /*
        Person objects with minimum age
        Define a simple class Person { String name; int age; }
        and create a list of several Person objects with different ages (for example: 12, 17, 25, 30, 8, 19).
        Use a stream to keep only those Person objects whose age is ≥ 18.
        After obtaining the filtered list, print only the names of the adults.

        (Reflection) What happens if you forget to call a terminal operation after filter? Do you see any results?

    */

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(

                new Person("Lisa" , 15),
                new Person("Maria" , 25),
                new Person("Jonas" , 34),
                new Person("Pedro" , 22),
                new Person("sarah" , 11),
                new Person("Lea" , 17));


        personList.stream()
                .filter(person -> person.getAge()>= 18)
                .forEach(person -> System.out.println(person.getName()));


        }




    }


