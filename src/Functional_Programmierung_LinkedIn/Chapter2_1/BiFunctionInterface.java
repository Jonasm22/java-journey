package Functional_Programmierung_LinkedIn.Chapter2_1;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add =  (x, y) -> x+y;
        System.out.println(add.apply(32,32));

        TriFunction<Integer, Integer ,Integer ,Integer> addThree = (x,y,z)-> x+y+z;

        System.out.println(addThree.apply(3, 4, 5));
        NoArgFunction<String> sayHello = ()-> "Helllo";
        System.out.println(sayHello.apply());


    }


}
