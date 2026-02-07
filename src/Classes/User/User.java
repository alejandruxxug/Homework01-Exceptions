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


    // Getters n Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
