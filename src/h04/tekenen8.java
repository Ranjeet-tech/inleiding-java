package h04;

import java.applet.Applet;
import java.awt.*;

public class tekenen8 extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        g.drawLine(10,30,200,30);
        g.drawString("lijn", 100,50);
        g.drawRect(10,60,200,100);
        g.drawString("rechthoek",85,180 );
        g.drawRoundRect(10,200,200,100,25,25);
        g.drawString("afgeronde rechthoek", 55, 320);
        g.setColor(Color.magenta);
        g.fillRect(220,60,200,100);
        g.setColor(Color.black);
        g.drawOval(220,60,200,100);
        g.setColor(Color.magenta);
        g.fillOval(220, 200,200,100);
        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal",280,180 );
        g.drawString("gevulde ovaal",280,320 );
        g.drawOval(470,200,100,100);
        g.drawString("cirkel",500,320 );




    }
}
