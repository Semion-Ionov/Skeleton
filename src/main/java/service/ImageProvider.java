package service;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.util.Objects;

public enum ImageProvider {
    MAP("/assets/map.png"),
    SKELETON("/assets/skeleton.png");

    private final String path;

    ImageProvider(String path) {
        this.path = path;
    }

    public Image getImage() {
        return new ImageIcon(Objects.requireNonNull(getClass().getResource(path))).getImage();
    }
}
