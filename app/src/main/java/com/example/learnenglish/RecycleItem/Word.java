package com.example.learnenglish.RecycleItem;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;



public class Word {
    private String russian;
    private String english;
    private int mp;
    private Uri uri;

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    public Uri getUri() {
        return uri;
    }

    public Word(String english, String russian, int mp) {
        this.russian = russian;
        this.english = english;
        this.mp = mp;
    }
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
