package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Direction {
    UP(0),
    LEFT(1),
    DOWN(2),
    RIGHT(3);

    private final int index;
}
