package controller;

import model.Skeleton;
import skeleton.SkeletonActionPerformer;
import skeleton.SkeletonKeyListener;
import skeleton.SkeletonRenderer;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.KeyListener;

public class SkeletonController {
    private final SkeletonKeyListener keyListener;
    private final SkeletonActionPerformer actionPerformer;
    private final SkeletonRenderer renderer;

    SkeletonController(JFrame frame) {
        Skeleton skeleton = new Skeleton();
        this.keyListener = new SkeletonKeyListener();
        this.actionPerformer = new SkeletonActionPerformer(frame, skeleton);
        this.renderer = new SkeletonRenderer(frame, skeleton);
    }

    KeyListener getKeyListener() {
        return keyListener;
    }

    void draw(Graphics g) {
        renderer.draw(g);
    }

    void doActions() {
        actionPerformer.doActions(keyListener.getPressedKeys());
    }
}
