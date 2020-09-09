package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen2 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawString("", 45, 80);
        g.drawRect(100,100,150,75);
        g.drawRect(175,50,75,50);
        g.drawLine(125, 175, 125, 135  );
        g.drawLine(125,135, 150,135);
        g.drawLine(150,135,150, 175);
        g.drawLine(200, 135, 220, 135);
        g.drawLine(220,135,220, 120 );
        g.drawLine(220, 120,200, 120 );
        g.drawLine(200, 120,200, 135 );
    }
}
