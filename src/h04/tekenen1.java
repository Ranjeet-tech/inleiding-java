package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen1 extends Applet {


    public void init() {

    }
    public void paint(Graphics g) {
      setBackground(Color.white);
     g.drawLine(100, 100, 200,100);
     g.drawLine(100,100,150,200);
     g.drawLine(200,100,150,200);
    }
}

