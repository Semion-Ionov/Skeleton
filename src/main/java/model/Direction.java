package model;


public enum Direction {
    UP(0),
    LEFT(1),
    DOWN(2),
    RIGHT(3);

    private final int num;

    Direction(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
