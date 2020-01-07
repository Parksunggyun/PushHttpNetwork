package com.sunggyun.pushhttpnetwork.network.dto;

public class Data {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Data(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
