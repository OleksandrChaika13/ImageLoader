package app.adapter;

import app.loader.IAdvancedLoader;
import app.loader.IMediaLoader;
import app.player.JpgPlayer;
import app.player.PngPlayer;

public class MediaAdapter implements IMediaLoader {

    IAdvancedLoader advancedLoader;

    public MediaAdapter(String pictureExtension) {


        if (pictureExtension.equalsIgnoreCase("jpg")) {
            advancedLoader = new JpgPlayer();
        } else if (pictureExtension.equalsIgnoreCase("png")) {
            advancedLoader = new PngPlayer();
        }
    }

    @Override
    public void launch(String pictureExtension, String pictureName) {
        if (pictureExtension.equalsIgnoreCase("jpg")) {
            advancedLoader.openJpg(pictureName);
        } else if (pictureExtension.equalsIgnoreCase("png")) {
            advancedLoader.openPng(pictureName);
        }
    }
}
