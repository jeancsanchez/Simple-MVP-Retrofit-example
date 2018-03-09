package com.example.jean.retrofitexample.Presenter;

import android.content.Context;

import com.example.jean.retrofitexample.Model.Country;
import com.example.jean.retrofitexample.Model.Data;
import com.example.jean.retrofitexample.Service.CountryService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jean on 29/07/16.
 */

public class CountryPresenter {
    private final Context context;
    private final CountryPresenterListener mListener;
    private final CountryService countryService;

    public interface CountryPresenterListener {
        void countriesReady(List<Country> countries);
    }

    public CountryPresenter(CountryPresenterListener listener, Context context) {
        this.mListener = listener;
        this.context = context;
        this.countryService = new CountryService();
    }

    public void getCountries() {
        countryService
                .getAPI()
                .getResults()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data = response.body();

                        if (data != null && data.getRestResponse() != null) {
                            List<Country> result = data.getRestResponse().getResult();
                            mListener.countriesReady(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
