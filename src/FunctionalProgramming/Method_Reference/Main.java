package FunctionalProgramming.Method_Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

       Person person = new Person();
       person.name = "Luis";

       Runnable greet = person::greeting;
       //greet.run();

        // Function with one input parameter and one output parameter Function<T, R>
        // Runable only executes = Runnable

        // Constructor reference


        BiFunction<String, Double, Persona> createPersona = Persona::new;
        Persona  persona = createPersona.apply("Maria", 1.72);
        //System.out.println("Persona: " + persona);


        //Reference to an instance method of an arbitrary object

        List<Persona> personasList = new ArrayList<>();
        personasList.add(new Employee());
        personasList.add(new Manager());
        personasList.add(new Employee());
        personasList.add(new Manager());

        personasList.forEach(Persona::greetings);

    }


}
