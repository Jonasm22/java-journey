package ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class myList {
    private ArrayList<personas> person;

    public myList() {
        this.person = new ArrayList<>();
    }

    public static void myArrayList() {


        ArrayList<String> personenNamen = new ArrayList<>();
        personenNamen.add("hannes");
        personenNamen.add("Lisa");


        for (String personen : personenNamen) {
            System.out.println(personen);
        }
    }


    public static void ObjArrayList() {

        ArrayList<personas> persone = new ArrayList<>();
        persone.add(new personas("Maria", "Muller"));
        persone.add(new personas("Lisa", "rojas"));
        persone.add(new personas("Jonas", "delgado"));
        persone.add(new personas("pedro", "cedeno"));
        persone.add(new personas("Lisa", "rojas"));
        persone.add(new personas("pel", "ras"));


        for (personas ListPerson : persone) {
            if (ListPerson.equals(persone)){
                System.out.println("Agregado");
            } else {
                System.out.println("existe");
            }
        }
        

    }
    public static void main(String[] args) {
    //myArrayList();
        ObjArrayList();



    }





}
