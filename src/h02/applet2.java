package h02;

import java.applet.Applet;
import java.awt.*;

public class applet2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Ranjeet",50, 60);
        g.drawString("lanting",50, 70  );

    }
}
