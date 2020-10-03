package com.company;

import java.awt.*;

public class Sun implements Drawable {

    private int x, y, r, R, n;

    public Sun(int x, int y, int r, int r1, int n) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, x, y, r, R, n);
    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n) {
        g.setColor(Color.ORANGE);
        g.setStroke(new BasicStroke(3));
        g.fillOval(x - r, y - r, r + r, r + r);

        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            double dx_1 = (r * Math.cos(da * i)) * 2;
            double dy_1 = (r * Math.sin(da * i)) * 2;
            double dx_2 = (R * Math.cos(da * i)) * 2;
            double dy_2 = (R * Math.sin(da * i)) * 2;

            g.setColor(Color.ORANGE);
            g.setStroke(new BasicStroke(3));
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
            g.setColor(Color.YELLOW);
            g.setStroke(new BasicStroke(6));
            g.drawLine(x + (int) dx_1, y + (int) dy_1, x + (int) dx_2, y + (int) dy_2);
        }
    }
}

