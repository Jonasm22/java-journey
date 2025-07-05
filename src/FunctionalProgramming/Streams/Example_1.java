package FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example_1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Lisa");
        names.add("Sarah");
        names.stream().forEach(System.out::println);


        System.out.println("---------------------------------------");

        //Arrays.asList dont need 'new' object
        List<String> countries = Arrays.asList(
                "Spain",
                "Mexico",
                "Germany",
                "Ecuador", "Argentina", "Italy", "Portugal", "Chile", "Colombia", "Peru");

        countries.stream()
                .filter(country->country.toLowerCase().contains("a"))
                .forEach(System.out::println);


    }



}
