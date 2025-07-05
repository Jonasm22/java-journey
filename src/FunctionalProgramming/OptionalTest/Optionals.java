package FunctionalProgramming.OptionalTest;

import java.util.Optional;

//OPTIONALS -> Null - Its doesnt exist.. Empty --> Exist but doesnt anycontent
public class Optionals {


    public static void main(String[] args) {

       Optional<String> stringNull = Optional.empty();
        // Optional<String> stringNull = Optional.ofNullable(null);
        //Optional<String> stringNull = Optional.of("buy");
        if(stringNull.isEmpty()) {
            System.out.println("No values");
        }
        else
            System.out.println("Value");
        }

    }

