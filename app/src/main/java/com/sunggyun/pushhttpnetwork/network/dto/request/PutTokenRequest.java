package com.sunggyun.pushhttpnetwork.network.dto.request;

public class PutTokenRequest {

    private String token;
    private String userId;

    public PutTokenRequest() {}

    public PutTokenRequest(String token, String userId) {
        this.token = token;
        this.userId = userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public String getUserId() {
        return userId;
    }
}
