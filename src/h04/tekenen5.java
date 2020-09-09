package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen5 extends Applet {


    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(100,100,50,100);

    }
}
