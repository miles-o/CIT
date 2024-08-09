1.  Create Student class from exercise in Session 2  
2. Create Student objects   
3. Print the details of Student objects and examine results in Terminal
```java
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
```