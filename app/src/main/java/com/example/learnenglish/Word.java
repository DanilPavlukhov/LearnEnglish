package com.example.learnenglish;

public class Word {
    private String russian;
    private String english;
    //private int int_Image;

    public Word(String codeName, String codeVersion /*, int int_Image*/) {
        this.russian = codeName;
        this.english = codeVersion;
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
