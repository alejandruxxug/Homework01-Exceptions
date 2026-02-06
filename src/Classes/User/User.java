package Classes.User;

public abstract class User {
    private static int counter = 0;
    private int id;
    private String name;
    private String email;

    public User(String name, String email) {
        counter++;
        id = counter;
        this.name = name;
        this.email = email;
    }
}
