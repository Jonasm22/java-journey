package FunctionalProgramming.Project_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Clients> clientsList = getClient();
        System.out.println("-----Wellcome----");
        System.out.println("Enter a customer number to send a package: ");
        Scanner keyboard = new Scanner(System.in);
        Long nummer = keyboard.nextLong();

       Optional <Clients> clients = searchClients(clientsList, nummer);
       //Check clients
        if(clients.isPresent()){
        Optional <String> address = getAddress(clients);

            //check if got the direction
            if(address.isPresent()){
                System.out.println("customer address is: " + address.get());
            }
            else {
                System.out.println("This Customer does not have address");
            }
        } else{
            System.out.println("The customer does not exists");
        }
    }

    private static Optional<String> getAddress(Optional<Clients> clients) {
        return clients
                .map(Clients::getAddress);

    }

    private static Optional <Clients> searchClients(List<Clients> clientsList, Long nummer) {

        return clientsList.stream()
                .filter(clients ->clients.getNumClients().equals(nummer))
                .findFirst();
    }

    public static List<Clients> getClient(){

        List<Clients> clients = Arrays.asList(
                new Clients(1l, "Alice", "Smith", "123 Maple St", "555-1001"),
                new Clients(2l, "Bob", "Johnson", null, "555-1002"),
                new Clients(3l, "Carol", "Williams", "789 Oak Ave", "555-1003"),
                new Clients(4l, "David", "Brown", null, "555-1004"),
                new Clients(5l, "Eve", "Jones", "456 Pine Rd", "555-1005"),
                new Clients(6l, "Frank", "Garcia", "321 Birch Blvd", "555-1006"),
                new Clients(7l, "Grace", "Martinez", null, "555-1007"),
                new Clients(8l, "Henry", "Davis", "654 Cedar Ln", "555-1008"),
                new Clients(9l, "Isabel", "Lopez", "987 Walnut St", "555-1009"),
                new Clients(10l, "Jack", "Gonzalez", null, "555-1010"),
                new Clients(11l, "Karen", "Wilson", "159 Spruce Dr", "555-1011"),
                new Clients(12l, "Leo", "Anderson", "753 Cherry St", "555-1012"),
                new Clients(13l, "Mia", "Thomas", null, "555-1013"),
                new Clients(14l, "Nina", "Taylor", "369 Palm Ave", "555-1014"),
                new Clients(15l, "Oscar", "Moore", "111 Ash Ct", "555-1015")
        );

        return clients;
    }
}
