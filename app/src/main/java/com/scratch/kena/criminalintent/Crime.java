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
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
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

    public String getSuspect() { return mSuspect; }

    public String getPhotoFilename() { return "IMG_" + getId().toString() + ".jpg"; }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setIsSolved(boolean isSolved){
        mSolved = isSolved;
    }

    public void setSuspect(String suspect) { mSuspect = suspect; }
}
