package OOP;

public abstract class Employee {

    private String name;
    private String address;
    private int age;

    public Employee(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void mailCheck()
    {
        System.out.println("Gui mail kiem tra toi " + this.name
                + " " + this.address);
    }

    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getAge()
    {
        return age;
    }
}
