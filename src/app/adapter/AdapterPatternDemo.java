package app.adapter;

import app.loader.ImageLoader;

public class AdapterPatternDemo {

    public static void adapter(){
        ImageLoader imageLoader = new ImageLoader();

        imageLoader.launch("heic", "vacation2021.heic");
        imageLoader.launch("jpg", "birthday0404.jpg");
        imageLoader.launch("png", "selfie.png");
        imageLoader.launch("gif", "meme.gif");
    }
}
