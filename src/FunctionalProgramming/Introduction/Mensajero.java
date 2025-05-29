package FunctionalProgramming.Introduction;


@FunctionalInterface
public interface Mensajero {

    //public void emitirMensaje();
    public void emitirSegundoMensaje(String mensaje , int edad);

}


@FunctionalInterface
 interface Calculo {

    //public void emitirMensaje();
    void operation (int... numeros);

}
