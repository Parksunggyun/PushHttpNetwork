package com.sunggyun.pushhttpnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sunggyun.pushhttpnetwork.network.HttpRequestService;
import com.sunggyun.pushhttpnetwork.network.dto.Data;
import com.sunggyun.pushhttpnetwork.network.dto.request.PutTokenRequest;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HttpRequestService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        String token = getSharedPreferences("userInfo", Context.MODE_PRIVATE).getString("token", null);

        Log.e("token", token + "");
        HttpRequestService httpRequestService = retrofit.create(HttpRequestService.class);
        PutTokenRequest request = new PutTokenRequest();
        request.setToken(token);
        request.setUserId("TEST_001");

        httpRequestService.putToken(request).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Log.e("data", response.body().get("result").toString());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<JsonObject> call, @NonNull Throwable t) {
                Log.e("t", t.getMessage());
            }
        });
    }
}
