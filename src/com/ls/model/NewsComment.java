package com.ls.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by LS on 2017/10/21 21:05.
 * To Be or Not to Be
 */
public class NewsComment implements Serializable{
    private int id;
    private int userId;
    private int infoId;
    private String userComment;
    private String commentDate;
    private NewsUser newsUser;

    public NewsComment() {
    }

    public NewsUser getNewsUser() {
        return newsUser;
    }

    public void setNewsUser(NewsUser newsUser) {
        this.newsUser = newsUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "NewsComment{" +
                "id=" + id +
                ", userId=" + userId +
                ", infoId=" + infoId +
                ", userComment='" + userComment + '\'' +
                ", commentDate='" + commentDate + '\'' +
                '}';
    }
}
