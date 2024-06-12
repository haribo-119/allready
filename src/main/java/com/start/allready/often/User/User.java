package com.start.allready.often.User;


import java.util.Objects;

public class User {

    String id;
    String pw;
    String nickName;
    String email;
    String name;
    String pwCheck;

    boolean isValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwCheck() {
        return pwCheck;
    }

    public void setPwCheck(String pwCheck) {
        this.pwCheck = pwCheck;
    }

    public boolean isValue() {
        return isValue;
    }
    public void setValue(boolean value) {
        isValue = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  User(){}

    public User(String id, String pw, String nickName, String email, String name, String pwCheck, boolean isValue) {
        this.id = id;
        this.pw = pw;
        this.nickName = nickName;
        this.email = email;
        this.name = name;
        this.pwCheck = pwCheck;
        this.isValue = isValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isValue == user.isValue && Objects.equals(id, user.id) && Objects.equals(pw, user.pw) && Objects.equals(nickName, user.nickName) && Objects.equals(email, user.email) && Objects.equals(name, user.name) && Objects.equals(pwCheck, user.pwCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pw, nickName, email, name, pwCheck, isValue);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", pwCheck='" + pwCheck + '\'' +
                ", isValue=" + isValue +
                '}';
    }

}
