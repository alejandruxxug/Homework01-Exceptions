package Classes.User;

public class Teacher extends User {
    private String department;

    //Constructor
    public Teacher(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }
}
