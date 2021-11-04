package model;

import utils.ImageUtils;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

public class Background {
    private final JFrame frame;
    private final Image img;

    public Background(JFrame frame) {
        this.frame = frame;
        this.img = ImageUtils.getImage("/assets/map.png");
    }

    public void draw(Graphics g) {
        g.drawImage(img, 0, 0, frame.getWidth(), frame.getHeight(), null);
    }
}
