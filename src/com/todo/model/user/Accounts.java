package com.todo.model.user;

/**
 * Created by suppulur on 2/19/2015.
 */
public class Accounts {
    private String userID;
    private String password;

    public Accounts() {
    }

    public Accounts(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
