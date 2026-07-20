package Homework_10;

import java.util.Objects;

public class User {
    private int id;
    private String userName;
    private String userEmail;

    public User(int id, String userName, String userEmail){
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;

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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString(){
        return "User Id - " + id + ", User Name - " + userName + ", User Email - " + userEmail;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(userName, user.userName) &&
                Objects.equals(userEmail, user.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userEmail);
    }
}
