package FunctionalProgramming.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(
                new Car("Volkswagen", "Amarok", 25000),
                new Car("Volkswagen", "Taos", 32000),
                new Car("Chevrolet", "Onix", 22000),
                new Car("Chevrolet", "Tracker", 30000),
                new Car("Fiat", "Cronos", 21000),
                new Car("Fiat", "Pulse", 24000),
                new Car("Toyota", "Corolla", 28000),
                new Car("Toyota", "Yaris", 23000),
                new Car("Renault", "Stepway", 20000),
                new Car("Renault", "Duster", 27000),
                new Car("Nissan", "Versa", 25000)
        );

        // 1. Sort by price ascending using sort
        System.out.println("--------------------------------------");
        System.out.println("Sort by price in ascending order using sort\n");

        List<Car> priceSorted = new ArrayList<>(carList);
        priceSorted.sort(Comparator.comparing(Car::getCost));
        priceSorted.forEach(System.out::println);

        // 2. Sort by brand then by price using sorted()
        System.out.println("--------------------------------------");
        System.out.println("Sort by brand and then by price using sorted()\n");

        carList.stream()
                .sorted(Comparator
                        .comparing(Car::getBrand)
                        .thenComparing(Car::getCost))
                .forEach(System.out::println);

        // 3. Cars with price not exceeding 23000
        System.out.println("--------------------------------------");
        System.out.println("Cars with price not exceeding 23000\n");

        carList.stream()
                .filter(car -> car.getCost() <= 23000)
                .forEach(System.out::println);

        // 4. Cars with brand Chevrolet or Volkswagen
        System.out.println("--------------------------------------");
        System.out.println("Cars with brand Chevrolet or Volkswagen\n");

        carList.stream()
                .filter(car -> car.getBrand().equals("Chevrolet") || car.getBrand().equals("Volkswagen"))
                .forEach(System.out::println);

        // 5. Cars whose model contains at least one “a”
        System.out.println("--------------------------------------");
        System.out.println("Cars whose model contains at least one 'a'\n");

        carList.stream()
                .filter(car -> car.getModel().toLowerCase().contains("a"))
                .forEach(System.out::println);
    }
}
