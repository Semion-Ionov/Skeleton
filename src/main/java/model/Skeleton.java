package model;

public class Skeleton {
    private static final int NUM_OF_POSES = 9;

    private int x, y;
    private Direction dir;
    private final double speed;
    private int poseIndex;

    public Skeleton() {
        x = y = 0;
        poseIndex = 0;
        dir = Direction.DOWN;
        speed = 0.0083;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public double getSpeed() {
        return speed;
    }

    public int getPoseIndex() {
        return poseIndex;
    }

    public void setNextPose() {
        poseIndex = ++poseIndex % NUM_OF_POSES;
    }
}
