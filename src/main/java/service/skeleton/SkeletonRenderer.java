package service.skeleton;

import model.Skeleton;
import service.ImageProvider;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

public class SkeletonRenderer {
    public static final double SKELETON_SCALE = 0.125;
    public static final int PIXELS_PER_SPRITE = 64;
    public static final int NUM_OF_SPRITES = 9;

    private final JFrame frame;
    private final Skeleton skeleton;
    private final Image img;

    public SkeletonRenderer(JFrame frame, Skeleton skeleton) {
        this.frame = frame;
        this.skeleton = skeleton;
        this.img = ImageProvider.SKELETON.getImage();
    }

    public void draw(Graphics g) {
        int skeletonSize = (int) (frame.getWidth() * SKELETON_SCALE);

        int dx1 = (int) (skeleton.getPos().getX() * frame.getWidth());
        int dy1 = (int) (skeleton.getPos().getY() * frame.getHeight());
        int dx2 = dx1 + skeletonSize;
        int dy2 = dy1 + skeletonSize;

        int sx1 = skeleton.getSpriteIndex() % NUM_OF_SPRITES * PIXELS_PER_SPRITE;
        int sy1 = skeleton.getDir().getIndex() * PIXELS_PER_SPRITE;
        int sx2 = sx1 + PIXELS_PER_SPRITE;
        int sy2 = sy1 + PIXELS_PER_SPRITE;

        g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
    }
}
