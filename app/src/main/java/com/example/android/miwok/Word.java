package com.example.android.miwok;

import android.media.Image;

import static com.example.android.miwok.R.id.miwokImage;

/**
 * Created by mikem on 1/24/2017.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for the word
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
