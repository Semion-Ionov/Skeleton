package service;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

public class BackgroundRenderer {
    private final JFrame frame;
    private final Image img;

    public BackgroundRenderer(JFrame frame) {
        this.frame = frame;
        this.img = ImageProvider.MAP.getImage();
    }

    public void draw(Graphics g) {
        g.drawImage(img, 0, 0, frame.getWidth(), frame.getHeight(), null);
    }
}
