package skeleton;

import model.Direction;


public interface Movable {
    double TOP_BORDER_COEF = -0.03;
    double BOT_BORDER_COEF = 0.76;
    double LEFT_BORDER_COEF = -0.03;
    double RIGHT_BORDER_COEF = 0.88;

    void move(Direction dir);
}
