package service.skeleton;

import model.Direction;
import model.Skeleton;

import javax.swing.JFrame;

public class SkeletonMover {
    private static final double TOP_BOUND_MULTIPLIER = -0.03;
    private static final double BOT_BOUND_MULTIPLIER = 0.76;
    private static final double LEFT_BOUND_MULTIPLIER = -0.03;
    private static final double RIGHT_BOUND_MULTIPLIER = 0.88;

    private final JFrame frame;
    private final Skeleton skeleton;

    public SkeletonMover(JFrame frame, Skeleton skeleton) {
        this.frame = frame;
        this.skeleton = skeleton;
    }

    public void move(Direction dir) {
        skeleton.setDir(dir);
        skeleton.setNextPose();

        int shift = (int) (frame.getWidth() * skeleton.getSpeed());

        switch (dir) {
            case UP:
                skeleton.setY((int) Math.max(skeleton.getY() - shift, frame.getHeight() * TOP_BOUND_MULTIPLIER));
                break;
            case DOWN:
                skeleton.setY((int) Math.min(skeleton.getY() + shift, frame.getHeight() * BOT_BOUND_MULTIPLIER));
                break;
            case LEFT:
                skeleton.setX((int) Math.max(skeleton.getX() - shift, frame.getWidth() * LEFT_BOUND_MULTIPLIER));
                break;
            case RIGHT:
                skeleton.setX((int) Math.min(skeleton.getX() + shift, frame.getWidth() * RIGHT_BOUND_MULTIPLIER));
                break;
            default:
                break;
        }
    }
}
