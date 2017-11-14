package com.mycompany.chasarbetsprov.entity;

public class Tweet {

    private String message;
    private int userId;
    private int id;
    String timeStamp;

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setTweet(String message) {
        this.message = message;
    }

    public String getTweet() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}