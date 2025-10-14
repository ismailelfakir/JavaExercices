public class Student {
    String name;
    int age;
    String studentId;

    // --------- Display student info method
    public void displayInfo() {
        System.out.println("---- Student information ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("-----------------------------");
    }

    // ------- Check if the student is an adult
    public boolean isAdult() {
        return age >= 18;
    }
}
