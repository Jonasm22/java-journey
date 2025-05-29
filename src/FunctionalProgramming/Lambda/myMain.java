package FunctionalProgramming.Lambda;

import FunctionalProgramming.Introduction.Operator;

public class myMain {
    public static void main(String[] args) {

        // con clases anonimas
        Operator sume = new Operator() {
            @Override
            public int operar(int num1, int num2) {
                return num1 + num2;
            }

        };

        System.out.println("suma anonima: " + sume.operar(4, 4));

        // con lambdas

        Operator suma = (num1, num2) -> num1+num2;
        System.out.println("suma  lambda : " + suma.operar(6, 4));


    }

}

