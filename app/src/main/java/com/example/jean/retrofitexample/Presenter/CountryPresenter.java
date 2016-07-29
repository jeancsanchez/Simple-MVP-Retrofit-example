package com.example.jean.retrofitexample.Presenter;

import android.content.Context;

import com.example.jean.retrofitexample.Model.RestResponse;
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

    public interface CountryPresenterListener{
        void countriesReady(List<RestResponse.Country> countries);
    }

    public CountryPresenter(CountryPresenterListener listener, Context context){
        this.mListener = listener;
        this.context = context;
        this.countryService = new CountryService();
    }

    public void getCountries(){
        countryService
                .getAPI()
                .getResults()
                .enqueue(new Callback<RestResponse>() {
                    @Override
                    public void onResponse(Call<RestResponse> call, Response<RestResponse> response) {
                        RestResponse result = response.body();

                        if(result != null)
                            mListener.countriesReady(result.getResult());
                    }

                    @Override
                    public void onFailure(Call<RestResponse> call, Throwable t) {
                        try {
                            throw  new InterruptedException("Erro na comunicação com o servidor!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}
