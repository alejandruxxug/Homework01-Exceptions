package Classes.User;

public class Student extends User {
    private int semester;

    //Constructor
    public  Student(String name, String email, int semester) {
        super(name, email);
        this.semester= semester;
    }
}
