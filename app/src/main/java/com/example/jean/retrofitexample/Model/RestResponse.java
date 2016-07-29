package com.example.jean.retrofitexample.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jean on 29/07/16.
 */

public class RestResponse {
    private List<String> messages;
    private List<Country> result;

    public List<Country> getResult(){
        return result;
    }

    public List<String> getMessages(){
        return messages;
    }

    public class Country {
        @SerializedName("name")
        private String name;

        @SerializedName("alpha2_code")
        private String alphaCode2;

        @SerializedName("alpha3_code")
        private String alphaCode3;


        public String getName() {
            return name;
        }

        public String getAlphaCode2() {
            return alphaCode2;
        }

        public String getAlphaCode3() {
            return alphaCode3;
        }
    }
}