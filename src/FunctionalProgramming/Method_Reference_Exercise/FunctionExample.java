package FunctionalProgramming.Method_Reference_Exercise;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> nameLength = name -> name.trim().length();
        Function<String, String> reverse = name -> new StringBuilder(name.trim()).reverse().toString();
        Function<String , Long> countVowel = name -> name.toLowerCase()
                .chars()
                .filter(c -> "aeiuo".indexOf(c) >= 0)
                .count();

        String input = "Jonathan";
        System.out.printf("Name: %s%nLength: %d%n", input , nameLength.apply(input));
        System.out.printf("Reversed: %s%n", reverse.apply(input));
        System.out.printf("Vowel count: %d%n", countVowel.apply(input));
    }
}

