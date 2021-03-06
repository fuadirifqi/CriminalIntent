package com.example.fuadirifqi.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by fuadirifqi on 3/31/16.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    private String mSuspect;


    public Crime(){
        this(UUID.randomUUID());

    }
    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String Suspect) {
        this.mSuspect = Suspect;
    }

    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }
}
