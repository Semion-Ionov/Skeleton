package controller;

import model.Background;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController extends JPanel implements ActionListener {
    JFrame frame;
    Timer timer;
    Background background;
    SkeletonController skeletonController;

    public GameController(JFrame frame) {
        this.frame = frame;
        this.timer = new Timer(50, this);
        this.background = new Background(frame);
        this.skeletonController = new SkeletonController(frame);

        frame.addKeyListener(skeletonController.getKeyListener());
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        background.draw(g);
        skeletonController.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        skeletonController.doActions();
        repaint();
    }
}