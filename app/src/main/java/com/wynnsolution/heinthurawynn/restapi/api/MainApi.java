package com.wynnsolution.heinthurawynn.restapi.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hein Thura Wynn on 4/23/2017.
 */

public class MainApi {
    private  static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("http://second.omimyanmar.org/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(new OkHttpClient());

    public MainApi(){

    }

    public static <S> S CreateService(Class<S> serviceClass){
        Retrofit retrofit = builder.build();
        return retrofit.create(serviceClass);
    }
}
