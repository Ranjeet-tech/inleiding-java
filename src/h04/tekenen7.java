package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen7 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawRoundRect(50,50,100,100,100,10);
        g.fillOval(67, 67,25,25);
        g.fillOval(67, 102,25,25);
        g.fillOval(107, 67,25,25);
        g.fillOval(107, 102,25,25);

    }
}
