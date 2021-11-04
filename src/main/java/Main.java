import controller.GameController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        startNewGame();
    }

    private static void startNewGame() {
        JFrame frame = new JFrame("Skeleton");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new GameController(frame));
        frame.setVisible(true);
    }
}
