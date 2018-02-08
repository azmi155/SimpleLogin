package com.kodeanlab.simplelogin.models;

/**
 * Created by yan1435 on 06/02/18.
 */

public class User {

    String username;
    String password;

    public User (String username){
        setUsername(username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
