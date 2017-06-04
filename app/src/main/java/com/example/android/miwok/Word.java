package com.example.android.miwok;

/**
 * Created by soubhik.sm on 01-06-2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public static final int NO_IMAGE=-1;
    private int imgResourceID=NO_IMAGE;

    public Word(String s1, String s2, int resID){
        mDefaultTranslation=s1;
        mMiwokTranslation=s2;
        imgResourceID=resID;
    }

    public Word(String s1, String s2){
        mDefaultTranslation=s1;
        mMiwokTranslation=s2;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return imgResourceID; }

    public boolean hasImage(){
        return NO_IMAGE!=imgResourceID;
    }
}
