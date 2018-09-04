package com.example.uchiha.json_parsing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Data_Model {

    /*@SerializedName("responsepojo")
    private List<Response> responsepojo=null;

    public List<Response> getResponse() {
        return responsepojo;
    }
*/

    @SerializedName("response")
    @Expose
    private Resultresponse response;

    public Resultresponse getResponse() {
        return response;
    }
}
