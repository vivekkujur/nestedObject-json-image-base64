package com.example.uchiha.json_parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.uchiha.json_parsing.retrofit.APIClient;
import com.example.uchiha.json_parsing.retrofit.APIInterface;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static retrofit2.converter.gson.GsonConverterFactory.create;

public class MainActivity extends AppCompatActivity {

    private Call<Data_Model> listCall;
    private TextView textView;
    ImageView imageView;
    private APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.maintext);
        imageView=findViewById(R.id.image);

        apiInterface = APIClient.getClient().create(APIInterface.class);

        listCall=apiInterface.getlist();
        listCall.enqueue(new Callback<Data_Model>() {
            @Override
            public void onResponse(Call<Data_Model> call, Response<Data_Model> response){


                String res=new Gson().toJson(response.body().getResponse().getQuestion().get(0).getqUESTIONTEXT()).toString();

                final String pureBase64Encoded = res.substring(res.indexOf(",")  + 1);
                textView.setText(pureBase64Encoded);
                final byte[] decodedBytes = Base64.decode(pureBase64Encoded, Base64.DEFAULT);
                Glide.with(MainActivity.this).load(decodedBytes).into(imageView);

            }

            @Override
            public void onFailure(Call<Data_Model> call, Throwable t) {
                Log.d("error", "onFailure: ");
            }
        });

    }
}
