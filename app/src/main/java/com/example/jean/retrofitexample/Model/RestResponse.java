package com.example.jean.retrofitexample.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 29/07/16.
 * Jesus loves you.
 */
public class RestResponse {

    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<Country> result;

    public List<Country> getResult() {
        return result;
    }

    public List<String> getMessages() {
        return messages;
    }
}