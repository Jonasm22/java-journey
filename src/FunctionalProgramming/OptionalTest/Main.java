package FunctionalProgramming.OptionalTest;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        exercise_3();

    }


    public static void exercise_1(){
    Optional<String> stringNull = Optional.ofNullable(null);
        if(stringNull.isEmpty()){
            System.out.println("The value is empty");
        } else if (stringNull == null) {
            System.out.println("the value is null");
        }

    }


    public static void exercise_2(){

       // Optional<String> values =Optional.of(null);
       Optional<String> values =Optional.of("Hello World");

        if(values.isEmpty()){
            System.out.println("The value is empty");
        } else {
            System.out.println("A value exits");
        }
        
    }


    public static void exercise_3(){
        Optional<String> values =Optional.empty();

        if(values.isEmpty()){
            System.out.println("The value is empty");
        } else {
            System.out.println("A value exits");
        }

    }


}
