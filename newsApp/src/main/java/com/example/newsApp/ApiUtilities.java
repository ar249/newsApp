package com.example.newsApp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static Retrofit retrofit=null;


    public static ApiInterface getApiInterface(){

        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())  // mapping json data to java application
                       .build();
        }
        return retrofit.create(ApiInterface.class);
    }

}
