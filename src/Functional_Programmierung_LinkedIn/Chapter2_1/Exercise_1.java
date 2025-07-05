package Functional_Programmierung_LinkedIn.Chapter2_1;
import java.util.function.Function;

public class Exercise_1 {

    protected static  class MyMath{
        public static Integer tripe(Integer x){
            return  x *3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTripe = MyMath::tripe;
        Integer result = myTripe.apply(5);
        System.out.println(result);

    }
}
