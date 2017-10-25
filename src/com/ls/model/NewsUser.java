package com.ls.model;

import java.io.Serializable;

/**
 * Created by LS on 2017/10/21 21:04.
 * To Be or Not to Be
 */
public class NewsUser implements Serializable{
    private int id;
    private String userName;
    private String userPassword;
    private int type;

    public NewsUser() {
    }

    public NewsUser(String userName, String userPassword, int type) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.type = type;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewsUserService{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", type=" + type +
                '}';
    }
}
