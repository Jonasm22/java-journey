package FunctionalProgramming.Method_Reference;

public class Persona {
    String name;
    double height;

    public Persona() {
    }

    public Persona(String name, double height) {
        this.name = name;
        this.height = height;
    }

   public void greetings(){
        System.out.println("name: " + name);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", Height=" + height +
                '}';
    }
}
