public class Student {
    public String studentID;
    public String firstName;
    public String lastName;
    public String email;
    public String certificate;
    public boolean partTime;

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
