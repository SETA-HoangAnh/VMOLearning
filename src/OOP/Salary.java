package OOP;

public class Salary extends Employee{

    private double salary;

    public Salary(String name, String address, int age, double salary) {
        super(name, address, age);
        setSalary(salary);
    }

    public double getSalary(){

        return salary;
    }

    private double setSalary(double newSalary) {

        salary = newSalary;
        return salary;
    }

    public void mailCheck(){

        System.out.println("Gui mail kiem tra toi " + getName()
                + " " + getAddress() + " voi muc luong " + "la " + salary);
    }
}
