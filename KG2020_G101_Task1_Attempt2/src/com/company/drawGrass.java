package com.company;

import java.awt.*;

class Grass implements Drawable {
    private int x, y, w, h;
    private Color c;

    public Grass(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    @Override
    public void draw(Graphics2D g) {
        drawGrass(g, x, y, w, h, Color.GREEN);
    }

    public static void drawGrass(Graphics2D g, int x, int y, int w, int h, Color c) {
        g.setColor(c);
        g.fillRect(x, y, w, h);
    }
}