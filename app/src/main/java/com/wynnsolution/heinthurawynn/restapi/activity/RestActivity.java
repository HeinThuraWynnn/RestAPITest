package com.wynnsolution.heinthurawynn.restapi.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.wynnsolution.heinthurawynn.restapi.R;
import com.wynnsolution.heinthurawynn.restapi.api.MainApi;
import com.wynnsolution.heinthurawynn.restapi.api.MainService;
import com.wynnsolution.heinthurawynn.restapi.gmodel.ConstituenciesG;
import com.wynnsolution.heinthurawynn.restapi.gmodel.ConstituencyG;
import com.wynnsolution.heinthurawynn.restapi.rmodel.ConstituencyR;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RestActivity extends AppCompatActivity {
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        realm = Realm.getDefaultInstance();

        Call<ConstituenciesG> gCall = MainApi.CreateService(MainService.class).getConstituency("MMR013002");
        gCall.enqueue(new Callback<ConstituenciesG>() {
            @Override
            public void onResponse(Call<ConstituenciesG> call, Response<ConstituenciesG> response) {
                realm.beginTransaction();
                for(ConstituencyG constituencyG: response.body().getConstituencyGs()){
                    ConstituencyR constituencyR = realm.createObject(ConstituencyR.class);
                    constituencyR.set_id(constituencyG.get_id());
                    constituencyR.setAm_constituency(constituencyG.getAm_constituency());
                    constituencyR.setAm_constituency_no(constituencyG.getAm_constituency_no());
                    constituencyR.setTownship_name(constituencyG.getTownship_name());
                    constituencyR.setWard_village(constituencyG.getWard_village());
                    constituencyR.setTownship_pcode(constituencyG.getTownship_pcode());
                    constituencyR.setRegion_pcode(constituencyG.getRegion_pcode());
                    constituencyR.setAM_PCODE(constituencyG.getAM_PCODE());
                }
             realm.commitTransaction();
//                Log.d("Constituency",response.body().getConstituencyGs().toString());
            }

            @Override
            public void onFailure(Call<ConstituenciesG> call, Throwable t) {

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
