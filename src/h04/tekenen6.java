package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen6 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.fillRect(100,100,75,200);
        g.setColor(Color.red);
        g.fillOval(112, 110,50,50);
        g.setColor(Color.orange);
        g.fillOval(112, 170, 50,50);
        g.setColor(Color.green);
        g.fillOval(112,230,50,50);
    }
}
