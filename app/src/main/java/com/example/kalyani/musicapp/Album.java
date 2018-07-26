package com.example.kalyani.musicapp;

public class Album {
    private String msongName;
    private String mMovieName;
    public Album(String MovieName, String songName){
        mMovieName= MovieName;
        msongName = songName;
    }
    public String getsongName(){
        return msongName;
    }

    public String getMovieName() {
        return mMovieName;
    }
}
