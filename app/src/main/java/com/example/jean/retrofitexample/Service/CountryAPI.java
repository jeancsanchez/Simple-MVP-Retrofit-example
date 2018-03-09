package com.example.jean.retrofitexample.Service;

import com.example.jean.retrofitexample.Model.Data;
import com.example.jean.retrofitexample.Model.RestResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * This class represents the Countries API, all endpoints can stay here.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public interface CountryAPI {

    @GET("country/get/all")
    Call<Data> getResults();

    @GET("country/get/iso2code/{alpha2_code}")
    Call<Data> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);
}
