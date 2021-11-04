package skeleton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

public class SkeletonKeyListener extends KeyAdapter {
    private final Set<Integer> pressedKeys = new HashSet<>();

    public Set<Integer> getPressedKeys() {
        return pressedKeys;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pressedKeys.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pressedKeys.remove(e.getKeyCode());
    }
}
