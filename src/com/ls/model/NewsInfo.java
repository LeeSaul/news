package com.ls.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by LS on 2017/10/21 21:04.
 * To Be or Not to Be
 */
public class NewsInfo implements Serializable{
    private int id;
    private int userId;
    private String title;
    private String content;
    private String releaseDate;
    private NewsUser newsUser;
    public NewsInfo() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
