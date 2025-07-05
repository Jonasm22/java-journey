package Functional_Programmierung_LinkedIn.Chapter2_1;

public class Excercise_2 {

    protected  static class Person{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

    }

    protected static  class DataLoader{
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDeveloper) {
                this.loadPerson = isDeveloper
                 ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal(){
            System.out.println("Loading Person...");
            return new Person("Real Person", 30);
        }

        private Person loadPersonFake(){

            System.out.println("Returning Fake Person object");
            return new Person("Fake Person" , 100);

        }

    }

    public static void main(String[] args) {
        final Boolean IS_DEVELOPER = false;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPER);
        System.out.println(dataLoader.loadPerson.apply());
    }


    }


