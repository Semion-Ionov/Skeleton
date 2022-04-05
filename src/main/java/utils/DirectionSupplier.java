package utils;

import model.Direction;

import java.awt.event.KeyEvent;
import java.util.Map;

public class DirectionSupplier {
    private static final Map<Integer, Direction> KEY_TO_DIR = Map.of(
        KeyEvent.VK_W, Direction.UP,
        KeyEvent.VK_S, Direction.DOWN,
        KeyEvent.VK_A, Direction.LEFT,
        KeyEvent.VK_D, Direction.RIGHT);

    public static Direction get(int keyEvent) {
        return  KEY_TO_DIR.get(keyEvent);
    }
}
