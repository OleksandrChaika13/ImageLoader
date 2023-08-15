package app.loader;

import app.adapter.MediaAdapter;

public class ImageLoader implements IMediaLoader {

    MediaAdapter mediaAdapter;

    @Override
    public void launch(String pictureExtension, String pictureName) {

        if (pictureExtension.equalsIgnoreCase("heic")) {
            System.out.println("Opening heic image: " + pictureName);
        }

        else if (pictureExtension.equalsIgnoreCase("jpg") ||
                pictureExtension.equalsIgnoreCase("png")
        ) {
            mediaAdapter = new MediaAdapter(pictureExtension);
            mediaAdapter.launch(pictureExtension, pictureName);
        } else {
            System.out.println("Invalid file format: " + pictureExtension
                    + " is not supported :(");
        }
    }
}
