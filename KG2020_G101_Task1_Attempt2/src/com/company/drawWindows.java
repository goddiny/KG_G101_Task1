package com.company;

import java.awt.*;

class Window implements Drawable {

    private int x, y, f, n, w, h;

    public Window(int x, int y, int w, int h, int f, int n) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.f = f;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D g) {
        drawWindows(g, x, y, w, h, f, n);
    }

    public static void drawWindows(Graphics2D g, int x, int y, int w, int h, int f, int n) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < n; j++) {
                g.setColor(Color.cyan);
                g.fill(Rect((x + 10) + w * j + 8 * j, (y + 5) + h * i + 3 * i, w, h));
                g.setColor(Color.darkGray);
                g.setStroke(new BasicStroke(3));
                g.drawRect((x + 10) + w * j + 8 * j, (y + 5) + h * i + 3 * i, w, h);
                g.drawLine((int) (x + h / 2) + w * j + 8 * j, (y + 5) + h * i + 3 * i, (int) (x + h / 2) + w * j + 8 * j, (y + h + 5) + h * i + 3 * i);
            }
        }
    }

    private static Shape Rect(int x, int y, int w, int h) {
        return new Rectangle(x, y, w, h);
    }
}
