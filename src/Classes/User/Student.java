package Classes.User;

public class Student extends User {
    private String department;

    //Constructor
    public  Student(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }
}
