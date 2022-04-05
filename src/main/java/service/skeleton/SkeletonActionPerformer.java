package service.skeleton;

import lombok.RequiredArgsConstructor;
import model.Direction;
import model.Skeleton;
import utils.DirectionSupplier;

import java.util.Set;

@RequiredArgsConstructor
public class SkeletonActionPerformer {

    private final Skeleton skeleton;

    public void doActions(Set<Integer> pressedKeys) {
        for (Integer key : pressedKeys) {
            Direction dir = DirectionSupplier.get(key);
            if (dir != null) {
                skeleton.incrementSprite();
                skeleton.setDir(dir);
                skeleton.updatePosition();
            }
        }
    }
}