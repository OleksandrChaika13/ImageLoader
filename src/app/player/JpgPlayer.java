package app.player;

import app.loader.IAdvancedLoader;

public class JpgPlayer implements IAdvancedLoader {
    @Override
    public void openJpg(String pictureName) {
        System.out.println("Opening jpg image: " + pictureName);
    }

    @Override
    public void openPng(String pictureName) {
    }
}
