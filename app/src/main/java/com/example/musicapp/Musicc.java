package com.example.musicapp;

public class Musicc {

    // The name of composer.
    private String mNameOfComposer;

    // The Musicc.
    private String mMusicc;

    /**
     * Create a new Musicc object.
     *
     * @param nameOfComposer is the name of composer (in English).
     * @param Musicc is the name of Musicc.
     */
    public Musicc (String nameOfComposer, String Musicc) {
        mNameOfComposer = nameOfComposer;
        mMusicc = Musicc;
    }

    // Get the name of composer.
    public String getNameOfComposer() {
        return mNameOfComposer;
    }

    // Get the name of Musicc.
    public String getMusicc() {
        return mMusicc;
    }
}
