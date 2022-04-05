package model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import utils.PositionUpdater;

@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Skeleton {

    @Setter
    private Position pos;
    @Setter
    private Direction dir;
    private double speed;
    private int spriteIndex;

    public void incrementSprite() {
        spriteIndex++;
    }

    public void updatePosition() {
        PositionUpdater.update(pos, dir, speed);
    }

    public static Skeleton getInstance() {
        return Skeleton.builder()
                       .speed(0.0083)
                       .pos(new Position(0.5, 0.5))
                       .dir(Direction.DOWN)
                       .spriteIndex(0)
                       .build();
    }
}
