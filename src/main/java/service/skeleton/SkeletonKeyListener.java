package service.skeleton;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SkeletonKeyListener extends KeyAdapter {
    private final Set<Integer> pressedKeys = new TreeSet<>(Comparator.reverseOrder());

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
