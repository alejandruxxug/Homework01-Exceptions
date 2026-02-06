package Classes.User;

public class Teacher extends User {
    private int semester;

    //Constructor
    public Teacher(String name, String email, int semester) {
        super(name, email);
        this.semester = semester;
    }
}
