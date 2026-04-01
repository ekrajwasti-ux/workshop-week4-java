package Workshop4;

class Person {
    protected String address;  

    Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    private String department;

    Employee(String address, String department) {
        super(address);  // call Person constructor
        this.department = department;
    }

    public void showDetails() {
        
        System.out.println("Address: " + address + ", Department: " + department);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee emp = new Employee("Biratnagar, Nepal", "IT");
        emp.showDetails();
    }
}