package model;

public class Skeleton {
    private int x, y;
    private int loop;
    private Direction dir;
    private final int numOfLoops;
    private final double speed;

    public Skeleton() {
        x = y = loop = 0;
        dir = Direction.DOWN;
        numOfLoops = 9;
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

    public int getLoop() {
        return loop;
    }

    public void incrementLoop() {
        loop = (++loop) % numOfLoops;
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
}
