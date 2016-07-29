package com.example.jean.retrofitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.jean.retrofitexample.Model.RestResponse;
import com.example.jean.retrofitexample.Presenter.CountryPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CountryPresenter.CountryPresenterListener {

    private CountryPresenter countryPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryPresenter = new CountryPresenter(this, this);
        countryPresenter.getCountries();
    }

    @Override
    public void countriesReady(List<RestResponse.Country> countries) {
        for(RestResponse.Country country : countries){
            Log.i("RETROFIT", country.getName() + "\n"
                    + " - Alpha2:  " + country.getAlphaCode2() +" \n"
                    + " - Alpha3: " + country.getAlphaCode3());
        }
    }
}
