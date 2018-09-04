package com.example.uchiha.json_parsing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class QuestionText {
    @SerializedName("SUBJECT_ID")
    @Expose
    private String sUBJECTID;
    @SerializedName("QUESTION_TEXT")
    @Expose
    private String qUESTIONTEXT;
    @SerializedName("OPTION_1")
    @Expose
    private Object oPTION1;
    @SerializedName("OPTION_2")
    @Expose
    private Object oPTION2;
    @SerializedName("OPTION_3")
    @Expose
    private Object oPTION3;
    @SerializedName("OPTION_4")
    @Expose
    private Object oPTION4;
    @SerializedName("CORRECT_ANS")
    @Expose
    private String cORRECTANS;

    public String getsUBJECTID() {
        return sUBJECTID;
    }

    public String getqUESTIONTEXT() {
        return qUESTIONTEXT;
    }

    public Object getoPTION1() {
        return oPTION1;
    }

    public Object getoPTION2() {
        return oPTION2;
    }

    public Object getoPTION3() {
        return oPTION3;
    }

    public Object getoPTION4() {
        return oPTION4;
    }

    public String getcORRECTANS() {
        return cORRECTANS;
    }
}
