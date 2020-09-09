package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen3 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
       setBackground(Color.white);
       g.setColor(Color.blue);
       g.fillRect(100,100, 50,100);
       g.setColor(Color.white);
       g.fillRect(150,100, 50,100);
       g.setColor(Color.red);
       g.fillRect(200,100, 50,100);
       g.setColor(Color.black);
       g.drawRect(95,100,5,200);

    }
}
