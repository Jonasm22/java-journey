package L_MapCollection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

        public static void main(String[] args) {

            //Import Map, HashMap
            Map<Integer,String> mapEmployee = new HashMap<>();

            mapEmployee.put(1523, "Map_Exercise");
            mapEmployee.put(1524, "Max_Mustermann");
            mapEmployee.put(1525, "Deutschland");

            //boolean isOrNot= mapEmployee.containsKey(1523);
            boolean isOrNot= mapEmployee.containsValue("Max_Mustermann");

            if(isOrNot == true) {

                System.out.println("The value Exist. ");

            }

            else{

                System.out.println("The value do not Exist. ");
            }

            /*
            <source lang = "es">
              Tutor: Luisina  - https://www.youtube.com/watch?v=jT0gnObfFls
            </source>
             */


        }

    }

