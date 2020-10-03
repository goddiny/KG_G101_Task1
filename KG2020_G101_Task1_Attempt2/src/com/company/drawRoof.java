package com.company;

import java.awt.*;

class Roof implements Drawable {

    @Override
    public void draw(Graphics2D g) {
        drawRoof(g);
    }

    public static void drawRoof(Graphics2D g) {
        int[] xPoints = {275, 450, 450};
        int[] yPoints = {225, 195, 225};
        g.setPaint(Color.red);
        g.fillPolygon(xPoints, yPoints, 3);
        g.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

