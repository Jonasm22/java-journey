package FunctionalProgramming.Introduction;

public class Programm {

    public static void main(String[] args) {


        /*Mensajero lamndaMensaje =  () ->{ System.out.println("Hello World");};
       lamndaMensaje.emitirMensaje();*/

        Mensajero lamndaMensaje =  (nombre, edad ) ->{
            System.out.println("Name : " + nombre );
            System.out.println("Edad: " + edad );};
        lamndaMensaje.emitirSegundoMensaje("Jonas" , 23);


        Calculo suma = (int ... valores) -> {

            int total = 0;
            StringBuilder expresion = new StringBuilder();

            for (int i = 0; i < valores.length; i++) {

                total += valores[i];
                expresion.append(valores[i]);
                if(i < valores.length -1){
                    expresion.append(" + ");
                }
            }
            expresion.append(" = ").append(total);
            System.out.println(expresion);
        };

        suma.operation(5,5,5,1,4);

    }


}
