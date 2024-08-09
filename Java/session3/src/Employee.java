public class Employee {
    public String employeeID;
    public String name;
    public int age;
    public String address;
    public String contactNumber;
    public String email;
    public String department;
    public String position;

    public Employee() {}

    public Employee(String name, String email, String department, String position) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.position = position;
        age = 20;
        employeeID = "CIT000000";
    }

    public String toString() {
        return name + " is " + age + " and works in " + department + " as " + position;
    }

    public void changeInformation(String info) {
		//implementation of the method
    }

    public void createProfile(String name, String email, String department, String position) {
		//implementation of the method
    }
}