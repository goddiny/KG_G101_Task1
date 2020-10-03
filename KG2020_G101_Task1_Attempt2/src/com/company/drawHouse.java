package com.company;

import java.awt.*;

class House implements Drawable {
    private int x, y, w, h;
    private Color c;


    public House(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    @Override
    public void draw(Graphics2D g) {
        drawHouse(g, x, y, w, h, Color.LIGHT_GRAY, Color.BLACK);
    }

    public static void drawHouse(Graphics2D g, int x, int y, int w, int h, Color c, Color c2) {
        g.setColor(c);
        g.fillRect(x, y, w, h);
        g.setStroke(new BasicStroke(5));
        g.setColor(c2);
        g.drawRect(x, y, w, h);

    }
}



