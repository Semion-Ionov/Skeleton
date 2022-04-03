package model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.awt.Point;

@Getter
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Skeleton {
    private static final int NUM_OF_SPRITES = 9;

    @Setter
    private Point position;
    @Setter
    private Direction dir;
    private double speed;
    private int spriteIndex;

    public void setNextSprite() {
        spriteIndex = ++spriteIndex % NUM_OF_SPRITES;
    }

    public static Skeleton getInstance() {
        return Skeleton.builder()
                       .speed(0.0083)
                       .position(new Point(0, 0))
                       .dir(Direction.DOWN)
                       .spriteIndex(0)
                       .build();
    }
}
