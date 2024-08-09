Create a Java class from the UML class diagram from [[Java Session 2 exercise 1 - Create student UML diagram]].
```java
public class Student {  
    public String studentID;  
    public String firstName;  
    public String lastName;  
    public String email;  
    public String certificate;  
    public Boolean partTime;  
 
    public Boolean checkStudyStatus() {  
        return partTime;  
    }  
}
```