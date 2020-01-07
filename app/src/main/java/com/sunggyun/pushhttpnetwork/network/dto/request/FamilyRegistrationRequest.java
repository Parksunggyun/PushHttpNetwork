package com.sunggyun.pushhttpnetwork.network.dto.request;

import com.sunggyun.pushhttpnetwork.network.dto.FamilyRelation;

import java.util.ArrayList;

public class FamilyRegistrationRequest {

    private String familyName;
    private String familyId;
    private String familyPhone;
    private String familyEmail;
    private String familyPassword;
    private ArrayList<FamilyRelation> userCode;

    public FamilyRegistrationRequest(String familyName, String familyId, String familyPhone, String familyEmail, String familyPassword, ArrayList<FamilyRelation> userCode) {
        this.familyName = familyName;
        this.familyId = familyId;
        this.familyPhone = familyPhone;
        this.familyEmail = familyEmail;
        this.familyPassword = familyPassword;
        this.userCode = userCode;
    }
}
