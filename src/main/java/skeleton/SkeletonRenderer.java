package skeleton;

import model.Skeleton;
import utils.ImageUtils;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

public class SkeletonRenderer implements Drawable {
    private final JFrame frame;
    private final Skeleton skeleton;
    private final Image img;

    public SkeletonRenderer(JFrame frame, Skeleton skeleton) {
        this.frame = frame;
        this.skeleton = skeleton;
        this.img = ImageUtils.getImage("/assets/skeleton.png");
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img,
            skeleton.getX(), skeleton.getY(),
            (int) (skeleton.getX() + frame.getWidth() * SIZE), (int) (skeleton.getY() + frame.getWidth() * SIZE),
            skeleton.getLoop() * DELTA, skeleton.getDir().getNum() * DELTA,
            (skeleton.getLoop() + 1) * DELTA, (skeleton.getDir().getNum() + 1) * DELTA,
            null);
    }
}
