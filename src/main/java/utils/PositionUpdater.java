package utils;

import model.Bound;
import model.Direction;
import model.Position;

import java.util.Map;
import java.util.function.BiConsumer;

public class PositionUpdater {
    private static final Map<Direction, BiConsumer<Position, Double>> DIR_TO_UPDATE = Map.of(
        Direction.UP, (pos, speed) -> pos.setY(Math.max(pos.getY() - speed, Bound.TOP.getCoefficient())),
        Direction.DOWN, (pos, speed) -> pos.setY(Math.min(pos.getY() + speed, Bound.BOT.getCoefficient())),
        Direction.LEFT, (pos, speed) -> pos.setX(Math.max(pos.getX() - speed, Bound.LEFT.getCoefficient())),
        Direction.RIGHT, (pos, speed) -> pos.setX(Math.min(pos.getX() + speed, Bound.RIGHT.getCoefficient())));

    public static void update(Position pos, Direction dir, double speed) {
        DIR_TO_UPDATE.get(dir).accept(pos, speed);
    }
}
