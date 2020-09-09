package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen4 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawRect(100,100, 50,200);
        g.drawRect(150,100, 50,200);
        g.drawRect(200,100, 50,200);
        g.drawString("valerie", 100, 315);
        g.drawString("jeroen", 150, 315);
        g.drawString("hans", 200, 315);
        g.setColor(Color.red);
        g.fillRect(100, 220,50,80);
        g.setColor(Color.yellow);
        g.fillRect(150,100,50,200);
        g.setColor(Color.blue);
        g.fillRect(200,140,50,160);
        g.setColor(Color.black);
        g.drawString("20", 80, 260);
        g.drawString("40", 80, 220);
        g.drawString("60", 80, 180);
        g.drawString("80", 80, 140);
        g.drawString("100", 80, 100);


    }
}
