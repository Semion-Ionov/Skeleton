package skeleton;

import model.Direction;
import model.Skeleton;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SkeletonActionPerformer {
    private final SkeletonMover mover;
    private final Map<Integer, Runnable> keyToAction;

    public SkeletonActionPerformer(JFrame frame, Skeleton skeleton) {
        this.mover = new SkeletonMover(frame, skeleton);
        this.keyToAction = generateKeyToActionDict();
    }

    public void doActions(Set<Integer> pressedKeys) {
        for (Integer key : pressedKeys) {
            Runnable action = keyToAction.get(key);
            if (action != null) {
                action.run();
            }
        }
    }

    private Map<Integer, Runnable> generateKeyToActionDict() {
        Map<Integer, Runnable> keyToAction = new HashMap<>();
        keyToAction.put(KeyEvent.VK_W, () -> mover.move(Direction.UP));
        keyToAction.put(KeyEvent.VK_S, () -> mover.move(Direction.DOWN));
        keyToAction.put(KeyEvent.VK_A, () -> mover.move(Direction.LEFT));
        keyToAction.put(KeyEvent.VK_D, () -> mover.move(Direction.RIGHT));
        return keyToAction;
    }
}
