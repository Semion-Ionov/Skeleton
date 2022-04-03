package service.skeleton;

import lombok.AllArgsConstructor;
import model.Direction;
import model.Skeleton;

import javax.swing.JFrame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@AllArgsConstructor
public class SkeletonActionPerformer {
    private static final double TOP_BOUND_COEFFICIENT = -0.03;
    private static final double BOT_BOUND_COEFFICIENT = 0.76;
    private static final double LEFT_BOUND_COEFFICIENT = -0.03;
    private static final double RIGHT_BOUND_COEFFICIENT = 0.88;

    private final Skeleton skeleton;
    private final Map<Direction, Consumer<Point>> dirToMovement;
    private final Map<Integer, Direction> keyToDir;

    public SkeletonActionPerformer(Skeleton skeleton, JFrame frame) {
        this(skeleton, getDirToMovement(skeleton.getSpeed(), frame), getKeyToDir());
    }

    public void doActions(Set<Integer> pressedKeys) {
        for (Integer key : pressedKeys) {
            Direction dir = keyToDir.get(key);
            if (dir != null) {
                skeleton.setNextSprite();
                skeleton.setDir(dir);
                dirToMovement.get(dir)
                             .accept(skeleton.getPosition());
            }
        }
    }

    private static Map<Direction, Consumer<Point>> getDirToMovement(double speed, JFrame f) {
        return Map.of(
            Direction.UP,
            (Point p) -> p.y = (int) Math.max(p.y - (f.getWidth() * speed), f.getHeight() * TOP_BOUND_COEFFICIENT),
            Direction.DOWN,
            (Point p) -> p.y = (int) Math.min(p.y + (f.getWidth() * speed), f.getHeight() * BOT_BOUND_COEFFICIENT),
            Direction.LEFT,
            (Point p) -> p.x = (int) Math.max(p.x - (f.getWidth() * speed), f.getWidth() * LEFT_BOUND_COEFFICIENT),
            Direction.RIGHT,
            (Point p) -> p.x = (int) Math.min(p.x + (f.getWidth() * speed), f.getWidth() * RIGHT_BOUND_COEFFICIENT));
    }

    private static Map<Integer, Direction> getKeyToDir() {
        return Map.of(
            KeyEvent.VK_W, Direction.UP,
            KeyEvent.VK_S, Direction.DOWN,
            KeyEvent.VK_A, Direction.LEFT,
            KeyEvent.VK_D, Direction.RIGHT);
    }
}
