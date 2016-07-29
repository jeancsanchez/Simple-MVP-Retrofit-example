package com.example.jean.retrofitexample.Service;

import com.example.jean.retrofitexample.Model.RestResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by jean on 29/07/16.
 */

public class CountryService {
    private static String BASE_URL =  "http://services.groupkt.com/";

    public interface  CountryAPI{
        @GET("country/get/all")
        Call<RestResponse> getResults();
    }

    public CountryAPI getAPI(){
        Retrofit retrofit = new Retrofit
                            .Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
        return retrofit.create(CountryAPI.class);
    }
}
