package com.wynnsolution.heinthurawynn.restapi.api;

import com.wynnsolution.heinthurawynn.restapi.gmodel.AuthorG;
import com.wynnsolution.heinthurawynn.restapi.gmodel.ConstituenciesG;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Hein Thura Wynn on 4/23/2017.
 */

public interface MainService {
    @GET("author")
    Call<AuthorG> getAuthors();
    @GET("stateregionhluttaw/{township_code}")
    Call<ConstituenciesG> getConstituency(@Path("township_code") String township_code);

}
