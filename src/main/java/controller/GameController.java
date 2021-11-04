package controller;

import service.BackgroundRenderer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController extends JPanel implements ActionListener {
    private final BackgroundRenderer backgroundRenderer;
    private final SkeletonController skeletonController;

    public GameController(JFrame frame) {
        this.backgroundRenderer = new BackgroundRenderer(frame);
        this.skeletonController = new SkeletonController(frame);

        frame.addKeyListener(skeletonController);
        new Timer(50, this).start();
    }

    @Override
    public void paint(Graphics g) {
        backgroundRenderer.draw(g);
        skeletonController.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        skeletonController.doActions();
        repaint();
    }
}