package com.jpcreation.shs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Praveen J
 * Date: 10/12/2016
 * Project: SHS
 * Package: com.jpcreation.shs
 * Description:
 */

public class MainActivity extends AppCompatActivity {
    private String url = "http://192.168.43.134";
    private ListView list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        loadData();
    }

    private void loadData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        RestAPI stack = retrofit.create(RestAPI.class);
        Call<Department> call = stack.getDepart("8");
        call.enqueue(new Callback<Department>() {
            @Override
            public void onResponse(Call<Department> call, Response<Department> response) {
                Toast.makeText(getApplicationContext(),"Size: "+response.body(), Toast.LENGTH_SHORT).show();
                //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,itemBean);
                //list.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Department> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
