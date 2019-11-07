package com.example.android.waitlist.data;

import java.io.Serializable;

public class Film implements Serializable {
    private String title;
    private float storyRate;
    private float realRate;
    private float musicRate;
    private float globalRate;
    private String resume;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getStoryRate() {
        return storyRate;
    }

    public void setStoryRate(float storyRate) {
        this.storyRate = storyRate;
    }

    public float getRealRate() {
        return realRate;
    }

    public void setRealRate(float realRate) {
        this.realRate = realRate;
    }

    public float getMusicRate() {
        return musicRate;
    }

    public void setMusicRate(float musicRate) {
        this.musicRate = musicRate;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public float getGlobalRate() {
        return globalRate;
    }

    public void setGlobalRate(float globalRate) {
        this.globalRate = globalRate;
    }
}
