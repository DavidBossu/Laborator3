package utm.Task2_4;

public class Worker extends Person{
    private String bank;

    public Worker(String name, String lastName, String bank){
        super(name, lastName);
        this.bank = bank;
    }

    public void displayInfo(){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("| " + "WorkerName: " + getName() + " | Last name: " + getLastName() + " | Bank: "+ bank + " |");
        System.out.println("-------------------------------------------------------------------");
    }
}
