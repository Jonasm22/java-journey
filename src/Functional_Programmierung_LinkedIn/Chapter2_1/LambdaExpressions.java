package Functional_Programmierung_LinkedIn.Chapter2_1;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {

        Function<Integer, Integer> absoluteValue = (x) -> {
        // (x)-> x < 0 ? -x : x;
            if(x <0){
                return -x;
            }else {
                return x;
            }
        };

        System.out.println(absoluteValue.apply(100));

    }
}
