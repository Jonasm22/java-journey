package Functional_Programmierung_2._2;

import java.util.List;
import java.util.stream.Collectors;

public class mapping {



    public static void main(String[] args) {
        excersice_3();
    }


    public static void  excersice_1(){

/*
Double the odd numbers
Start with the list List<Integer> datos = List.of(2, 3, 5, 8, 11, 14, 17);.
Filter only the odd numbers and, in the same pipeline, use map(...) to multiply each odd number by 10.
Collect the final result into a list of integers and display it on the screen.

*/
        List<Integer> datos = List.of(2, 3, 5, 8, 11, 14, 17);

        List<Integer> calculate = datos.stream()
                .filter( n->n%2 != 0)
                .map(n->n*10)
                .collect(Collectors.toList());
        System.out.println(calculate);

    }

    public static void excersice_2(){

        /*
            You have `List<String> rawNames = List.of(" juan perez ", "MARIA LOPEZ", "carlos martinez");`.
            Using a stream, do the following:

            Use `map(String::trim)` to remove leading and trailing spaces.
            Chain another `map(...)` to convert each string to lowercase (`s -> s.toLowerCase()`).

            Finally, use another `map(...)` to transform `"first last"` into the abbreviation `"F. L."`
             (for example, `"juan perez"` → `"J. P."`, paying attention to uppercase initials).
         */


        List<String> rawNames = List.of("  juan perez ", "MARIA LOPEZ", "carlos martinez");

        //Dificult
        rawNames.stream()
                .map(String::trim)
                .map(String::toLowerCase)
                .map(n->{
                  String[] parts =  n.split(" ");
                    String initial  = parts[0].substring(0,1).toUpperCase();
                    String initial2  = parts[1].substring(0,1).toUpperCase();
                    return initial + "." + initial2+".";
                })
                .forEach(System.out::println);
    }



    public static void  excersice_3(){

        /*
            **Price with VAT and label**
             Assume a list `List<Double> precios = List.of(9.99, 20.0, 5.5, 100.75, 49.0);` and a VAT rate of 21%.

            Use a stream to:

            * For each price, calculate the final price including VAT (for example, `price * 1.21`).
            * After calculating the price with VAT, convert each value to a string with the format `"€XX.YY"` (two decimal places).
            * Collect the results into a list of strings and display that list.

        */

        List<Double> precios = List.of(9.99, 20.0, 5.5, 100.75, 49.0);
        double vat = 1.21;

        List<String> finalPreis = precios.stream()
                .map(n-> String.format("€%.2f",n*vat))
                        .toList();

                finalPreis.forEach(System.out::println);


        //System.out.println(finalPreis);


    }

}