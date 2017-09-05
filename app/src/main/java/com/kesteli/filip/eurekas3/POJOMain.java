package com.kesteli.filip.eurekas3;

import android.graphics.Color;

/**
 * Created by Valemate on 1.9.2017..
 */

public class POJOMain {

    private String[] idejeTitles = {
            "Ubuntus",
            "Eurekas",
            "Science Browser",
            "Sign up",
            "Education Express",
            "Motivator",
            "Donate",
            "QUANTi"
    };

    private int[] idejeImages = {
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
            R.drawable.ic_favorite_white_24dp,
    };

    private int[] idejeColors = {
            Color.CYAN,
            Color.CYAN,
            Color.YELLOW,
            Color.YELLOW,
            Color.RED,
            Color.RED,
            Color.GREEN,
            Color.GREEN
    };

    public String[] getIdejeTitles() {
        return idejeTitles;
    }

    public void setIdejeTitles(String[] idejeTitles) {
        this.idejeTitles = idejeTitles;
    }

    public int[] getIdejeImages() {
        return idejeImages;
    }

    public void setIdejeImages(int[] idejeImages) {
        this.idejeImages = idejeImages;
    }

    public int[] getIdejeColors() {
        return idejeColors;
    }

    public void setIdejeColors(int[] idejeColors) {
        this.idejeColors = idejeColors;
    }
}
