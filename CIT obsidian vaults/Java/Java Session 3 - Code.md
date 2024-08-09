## Syntax templates
#### Creating an object 
```java
[dataType] variableName = new [dataType](parameters);
```
## Full code from this session
### Employee class
From [[Java Session 3 - From Design to Code]]
```java 
public class Employee {  
    public String employeeID;  
    public String name;  
    public int age;  
    public String address;  
    public String contactNumber;  
    public String email;  
    public String department;  
    public String position;  
  
    public static void main(String[] args) {  
        Employee emp1 = new Employee("Evelyn", "Evelyn.Zhao@cit.edu.au", "ICT", "teacher");  
        System.out.println(emp1);  
    }  
  
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
```
### Student class
From [[Java Session 3 exercise 1 - Create student object]]
```java
public class Student {  
    public String studentID;  
    public String firstName;  
    public String lastName;  
    public String email;  
    public String certificate;  
    public Boolean partTime;  
  
    public static void main(String[] args) {  
        Student student1 = new Student("286494", "Miles", "O'Hara-Dewhurst", "miles@noisyoyster.net", "Cert IV in IT", Boolean.FALSE);  
        System.out.println(student1);  
    }  
  
    public Student(String studentID, String firstName, String lastName, String email, String certificate, Boolean partTime) {  
        this.studentID = studentID;  
        this.firstName = firstName;  
        this.lastName = lastName;  
        this.email = email;  
        this.certificate = certificate;  
        this.partTime = partTime;  
    }  
  
    public String toString() {  
        return firstName + " " + lastName + " is studying a " + certificate + "\nPart time: " + partTime + "\nID: " + studentID + "\nEmail: " + email;  
    }  
  
    public Boolean checkStudyStatus() {  
        return partTime;  
    }  
}
```
### Full notes for this session at [[Java Session 3 - From Design to Code]]