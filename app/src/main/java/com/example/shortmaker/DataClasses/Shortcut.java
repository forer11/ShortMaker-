package com.example.shortmaker.DataClasses;

import android.graphics.drawable.Drawable;

public class Shortcut {
    public Shortcut() {
        /* empty public constructor for FireStore */
    }

    public Shortcut(String title, Drawable drawable) {
        this.title = title;
        this.drawable = drawable;
    }

    private String title;

    private Drawable drawable;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public Drawable getDrawable() {
        return this.drawable;
    }
}
