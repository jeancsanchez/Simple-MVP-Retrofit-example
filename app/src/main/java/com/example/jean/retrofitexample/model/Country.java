package com.example.jean.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents the country view interface.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
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
