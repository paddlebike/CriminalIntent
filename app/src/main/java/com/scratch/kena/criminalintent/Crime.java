package com.scratch.kena.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by kena on 7/31/17.
 * Taken from Android Programming: the Big Nerd Ranch 3.e
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean getIsSolved() {
        return mSolved;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setIsSolved(boolean isSolved){
        mSolved = isSolved;
    }
}
