package com.lsw.designpattern.prototype;

import android.util.Log;

import java.util.ArrayList;

/**
 * 原型
 * Created by Luosiwei on 2017/11/8.
 */

public class WordDocument implements Cloneable {
    // 文本
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        WordDocument wordDocument = (WordDocument) super.clone();
        wordDocument.mText = this.mText;
        wordDocument.mImages = (ArrayList<String>) this.mImages.clone();
        return wordDocument;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(String mImage) {
        this.mImages.add(mImage);
    }

    public void show() {
        Log.i("lsw", "----begin show----");
        Log.i("lsw", "----text----" + mText);
        for (String str : mImages) {
            Log.i("lsw", "----image----" + str);
        }
        Log.i("lsw", "----end show----");
    }
}
