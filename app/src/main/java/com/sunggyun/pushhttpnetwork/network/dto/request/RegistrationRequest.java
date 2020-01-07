package com.sunggyun.pushhttpnetwork.network.dto.request;

public class RegistrationRequest {

    private String userName;
    private String userId;
    private String userPhone;
    private String userBirthDay;
    private String userEmail;
    private String userPassword;
    private String organization;

    /**
     * 회원 정보를 기입합니다.
     * @param userName 이름
     * @param userId 아이디
     * @param userPhone 연락가능한 전화번호
     * @param userBirthDay 생년월일
     * @param userEmail 이메일
     * @param userPassword 비밀번호
     * @param organization 소속된 기관
     */
    public RegistrationRequest(String userName, String userId, String userPhone, String userBirthDay, String userEmail, String userPassword, String organization) {
        this.userName = userName;
        this.userId = userId;
        this.userPhone = userPhone;
        this.userBirthDay = userBirthDay;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.organization = organization;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserBirthDay() {
        return userBirthDay;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getOrganization() {
        return organization;
    }
}
