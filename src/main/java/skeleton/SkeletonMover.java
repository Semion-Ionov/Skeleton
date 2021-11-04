package skeleton;

import model.Direction;
import model.Skeleton;

import javax.swing.JFrame;


public class SkeletonMover implements Movable {
    private final JFrame frame;
    private final Skeleton skeleton;

    SkeletonMover(JFrame frame, Skeleton skeleton) {
        this.frame = frame;
        this.skeleton = skeleton;
    }

    @Override
    public void move(Direction dir) {
        skeleton.setDir(dir);
        int shift = (int) (frame.getWidth() * skeleton.getSpeed());
        skeleton.incrementLoop();

        switch (dir) {
            case UP:
                skeleton.setY((int) Math.max(skeleton.getY() - shift, frame.getHeight() * TOP_BORDER_COEF));
                break;
            case DOWN:
                skeleton.setY((int) Math.min(skeleton.getY() + shift, frame.getHeight() * BOT_BORDER_COEF));
                break;
            case LEFT:
                skeleton.setX((int) Math.max(skeleton.getX() - shift, frame.getWidth() * LEFT_BORDER_COEF));
                break;
            case RIGHT:
                skeleton.setX((int) Math.min(skeleton.getX() + shift, frame.getWidth() * RIGHT_BORDER_COEF));
                break;
            default:
                break;
        }
    }
}
