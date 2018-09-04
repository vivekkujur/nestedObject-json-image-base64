package com.example.uchiha.json_parsing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class Resultresponse {

    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("Question")
    @Expose
    private List<QuestionText> question = null;

    public String getResult() {
        return result;
    }

    public List<QuestionText> getQuestion() {
        return question;
    }
}
