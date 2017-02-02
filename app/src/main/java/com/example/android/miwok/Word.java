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
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }


    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;

    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    public int getAudioResourceId() {

        return mAudioResourceId;
    }

    public boolean HasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
