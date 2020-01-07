package com.sunggyun.pushhttpnetwork.network;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sunggyun.pushhttpnetwork.network.dto.Data;
import com.sunggyun.pushhttpnetwork.network.dto.request.FamilyRegistrationRequest;
import com.sunggyun.pushhttpnetwork.network.dto.request.LoginRequest;
import com.sunggyun.pushhttpnetwork.network.dto.request.PutMedalResult;
import com.sunggyun.pushhttpnetwork.network.dto.request.PutTokenRequest;
import com.sunggyun.pushhttpnetwork.network.dto.request.RegistrationRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface HttpRequestService {

    String URL = "http://192.168.0.28:8080";

    @POST("/token/registration")
    Call<JsonObject> putToken(@Body PutTokenRequest data);

    @GET("/members/{userId}")
    Call<Data> getData(@Path("userId") String userId);

    /**
     *
     * @param adminName 기관 대표 관리자 이름
     * @return 기관들 목록
     */
    @POST("/search/getOrganization")
    Call<Gson> getOrganizationRequest(@Body String adminName);

    /**
     *
     * @param phoneNumber 환자 전화번호
     * @return 환자 정보
     */
    @POST("/search/getUserInfo")
    Call<Gson> getUserInfoRequest(@Body String phoneNumber);

    @POST("/members/login")
    Call<Gson> loginRequest(@Body LoginRequest loginRequest);

    @PUT("/members/registration")
    Call<Gson> registrationRequest(@Body RegistrationRequest registrationRequest);

    @PUT("/members/familyRegistration")
    Call<Gson> familyRegistrationRequest(@Body FamilyRegistrationRequest familyRegistrationRequest);

    @PUT("/medal/putMedalResult")
    Call<Gson> putMedalResult(@Body PutMedalResult putMedalResult);

}
