package utils;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;


public class ImageUtils {
    public static Image getImage(String path) {
        return new ImageIcon(Objects.requireNonNull(ImageUtils.class.getResource(path))).getImage();
    }
}
