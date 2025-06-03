package Functional_Programmierung_2._1;

import java.util.List;
import java.util.stream.Collectors;

public class filter_1 {


    public static void main(String[] args) {


        excersice_2();
    }



    public static void excersice_1() {

        /* Given the list of integers*/

        List<Integer> nums = List.of(5, 12, 7, 18, 21, 30, 41, 60);

        //Filter all even numbers and store them in a new list.

        List<Integer> evenNumbers = nums.stream()
                .filter(n-> n % 2 == 0)
                .collect(Collectors.toList());



        // Filter all numbers that are multiples of 3 and store them in a different list.
        List<Integer> multipleOfthree = nums.stream()
                .filter(n-> n % 3 == 0)
                        .collect(Collectors.toList());




        // Then, print both lists to verify that the filtering worked correctly.

        System.out.println("Even Numbers: "+ evenNumbers);
        System.out.println(multipleOfthree);
    }



    public static void excersice_2(){

        /*Filter names by length*/

       // You have the list

        List<String> nombres = List.of("Luis", "Ana", "Catalina", "John", "Bea", "Martín", "Alexandra");

// Filter only the names whose length is strictly greater than 4 characters//
        nombres.stream()
        .filter(n->n.length()>4)
       .forEach(System.out::println);


        // Then, filter only those which,in addition to having length > 4, also start with “A” or “M” (two chained filters).
        // Remember: when chaining filters, the second `filter(...)` only applies to the elements that passed the first one.


        nombres.stream()
                .filter(n->n.length()>4)
                .filter(n->n.startsWith("M") || n.startsWith("A"))
                .forEach(System.out::println);







    }








}
