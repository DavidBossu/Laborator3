package utm.Task2_4;

public class Main {

    public static void main(String[] args) {
        Person Alex = new Worker("Alex", "Titulescu", "Bank Of Moldova");
        Alex.displayInfo();
        Person Vlad = new Client("Vlad", "Ursu", "Bank of Moldova");
        Vlad.displayInfo();
    }
}
