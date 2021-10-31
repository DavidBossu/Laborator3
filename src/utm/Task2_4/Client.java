package utm.Task2_4;

public class Client extends Person{
    private String bank;

    public Client(String name, String lastName, String bank){
        super(name, lastName);
        this.bank = bank;
    }

    public void displayInfo(){
        System.out.println("------------------------------------------------------------");
        System.out.println("| ClientName: " + getName() + "| Last name: " + getLastName() + "| Bank: "+ bank + " |");
        System.out.println("------------------------------------------------------------");
    }
}
