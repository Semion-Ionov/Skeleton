package model;


public enum Direction {
    UP(0),
    LEFT(1),
    DOWN(2),
    RIGHT(3);

    private final int index;

    Direction(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
