package utm.Task3;

public class NewClass implements TestInterface {

    @Override
    public void getName() {
        System.out.println("gg");
    }

    @Override
    public String getLastName() {
        System.out.println("Last Name");
        return null;
    }
}
