package Interfaces_;

interface Printer {
    void print(String message);

    default void printWelcome() {
        System.out.println("Willkommen beim Printer Interface!");
    }
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Time: " + System.currentTimeMillis() + " - " + message);
    }
}

 class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        printer.printWelcome();
        printer.print("Das ist eine benutzerdefinierte Nachricht.");
    }
}