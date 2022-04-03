package controller;

import model.Skeleton;
import service.skeleton.SkeletonActionPerformer;
import service.skeleton.SkeletonKeyListener;
import service.skeleton.SkeletonRenderer;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SkeletonController implements KeyListener {
    private final SkeletonKeyListener keyListener;
    private final SkeletonActionPerformer actionPerformer;
    private final SkeletonRenderer renderer;

    public SkeletonController(JFrame frame) {
        Skeleton skeleton = Skeleton.getInstance();
        this.keyListener = new SkeletonKeyListener();
        this.actionPerformer = new SkeletonActionPerformer(skeleton, frame);
        this.renderer = new SkeletonRenderer(frame, skeleton);
    }

    public void draw(Graphics g) {
        renderer.draw(g);
    }

    public void doActions() {
        actionPerformer.doActions(keyListener.getPressedKeys());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        keyListener.keyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyListener.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyListener.keyReleased(e);
    }
}
