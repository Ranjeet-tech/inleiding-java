package h06;

import java.applet.Applet;
import java.awt.*;

public class getallen1 extends Applet {

    //verdeling van het geld
    double totaalbedrag, aantalpersonen, bedragpp;

    public void init() {
        totaalbedrag = 113;
        aantalpersonen = 4;
        bedragpp = totaalbedrag / aantalpersonen;
        setBackground(Color.darkGray);

    }

    public void paint(Graphics g) {
     g.setColor(Color.white);

     String ali = "ali zijn aandeel is  "+ bedragpp;
     g.drawString(ali, 50,50);

     String jan = "jan zijn aandeel is "+ bedragpp;
     g.drawString(jan, 50,70);

     String jeanette = "jeanette zijn aandeel is " + bedragpp;
     g.drawString(jeanette, 50,90);

     String ranjeet = "ranjeet zijn aandeel is " + bedragpp;
     g.drawString(ranjeet, 50,110);
    }
}
