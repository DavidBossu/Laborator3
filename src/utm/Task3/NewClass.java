package utm.Task3;

public class NewClass implements TestInterface {

    @Override
    public void getName() {
        System.out.println("Alex");
    }

    @Override
    public String getLastName() {
        System.out.println("Titulescu");
        return null;
    }
}
