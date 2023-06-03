package com.example.learnenglish;

public class Word {
    private String russian;
    private String english;
    //private int int_Image;

    public Word(String english, String russian /*, int int_Image*/) {
        this.russian = russian;
        this.english = english;
        //this.int_Image = int_Image;
    }

    public void setCodeName(String codeName) {
        this.russian = codeName;
    }

    public void setCodeVersion(String codeVersion) {
        this.english = codeVersion;
    }

    /*public void setInt_Image(int int_Image) {
        this.int_Image = int_Image;
    }*/

    public String getRussian() {

        return russian;
    }

    public String getEnglish() {

        return english;
    }

    /*public int getInt_Image() {
        return int_Image;
    }*/
}
