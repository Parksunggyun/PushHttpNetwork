package com.sunggyun.pushhttpnetwork.network.dto.request;

public class LoginRequest {

    private String userId;
    private String userPwd;

    public LoginRequest(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }
}
