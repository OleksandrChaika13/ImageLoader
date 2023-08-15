package app.player;

import app.loader.IAdvancedLoader;

public class PngPlayer implements IAdvancedLoader {
    @Override
    public void openPng(String pictureName) {
        System.out.println("Opening png image: " + pictureName);
    }

    @Override
    public void openJpg(String pictureName) {
    }
}
