package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Bound {
    TOP(-0.03),
    BOT(0.76),
    LEFT(-0.03),
    RIGHT(0.88);

    private final double coefficient;
}