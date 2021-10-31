package utm.Task2_4;

public abstract class Person {
    private String name;
    private String lastName;

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    abstract public void displayInfo();

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
}
