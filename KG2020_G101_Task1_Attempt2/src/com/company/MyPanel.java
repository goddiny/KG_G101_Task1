package com.company;

import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    private House h = new House(300, 225, 150, 250, Color.LIGHT_GRAY);
    private Window w = new Window(298, 235, 20, 30, 5, 5);
    private Sun s = new Sun(20, 20, 50, 65, 30);
    private Grass grass = new Grass(0, 450, 500, 50, Color.green);
    private Text t = new Text();
    private Roof r = new Roof();

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        grass.draw(g2D);
        h.draw(g2D);
        w.draw(g2D);
        s.draw(g2D);
        r.draw(g2D);
        t.draw(g2D);
    }
}
