package pl.coderslab.entity;

public class User {

    private int id =0;
    private String userName;
    private String email;
    private String password;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }



    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }



}
