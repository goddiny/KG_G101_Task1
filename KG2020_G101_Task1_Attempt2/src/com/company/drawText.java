package com.company;

import java.awt.*;

class Text implements Drawable {

    @Override
    public void draw(Graphics2D g) {
        drawText(g);
    }

    public static void drawText(Graphics2D g) {
        g.setPaint(Color.blue);
        g.setFont(new Font("Ink Free", Font.BOLD, 30));
        g.drawString("Home, sweet home!", 200, 50);
    }
}
