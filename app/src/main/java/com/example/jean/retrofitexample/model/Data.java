package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents...
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public class Data {

    @SerializedName("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }
}
