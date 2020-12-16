package com.android.leybiography;

public class LanguageItem {

    private int mImageResource, mBackgroundResource, mLanguageDescription;
    private String mLanguageName;

    public LanguageItem(int mImageResource, int mBackgroundResource, String mLanguageName, int mLanguageDescription) {
        this.mImageResource = mImageResource;
        this.mLanguageName = mLanguageName;
        this.mLanguageDescription = mLanguageDescription;
        this.mBackgroundResource = mBackgroundResource;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmLanguageName() {
        return mLanguageName;
    }

    public int getmLanguageDescription() {
        return mLanguageDescription;
    }

    public int getmBackgroundResource() {
        return mBackgroundResource;
    }
}
