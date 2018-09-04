package com.example.uchiha.json_parsing.retrofit;

import com.example.uchiha.json_parsing.Data_Model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("/TestSeries_Android/demo-json.php")

    Call<Data_Model> getlist();

}
