public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Evelyn", "Evelyn.Zhao@cit.edu.au", "ICT", "teacher");
        System.out.println(emp1);
        System.out.println(emp2);

        Student student1 = new Student("286494", "Miles", "O'Hara-Dewhurst", """
                miles@noisyoyster.net""", "Cert IV in IT", false);
        System.out.println(student1);
    }
}
