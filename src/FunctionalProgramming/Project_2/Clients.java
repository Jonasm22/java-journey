package FunctionalProgramming.Project_2;

public class Clients {
        private Long numClients;
        private String name;
        private String lastName;
        private String address;
        private String phoneNumber;

        // Constructor
        public Clients(Long numClients, String name, String lastName, String address, String phoneNumber) {
            this.numClients = numClients;
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        // Getters
        public Long getNumClients() {
            return numClients;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        // Setters
        public void setNumClients(Long numClients) {
            this.numClients = numClients;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        // toString method
        @Override
        public String toString() {
            return "Client{" +
                    "numClients=" + numClients +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

