package h06;

import java.applet.Applet;
import java.awt.*;

public class getallen4 extends Applet {

    //variabelen voor gemiddelde berekenen
    double a,b,c,gemiddelde;


    public void init() {

        setBackground(Color.darkGray);
        a = 5.9;
        b = 6.3;
        c = 6.9;
        gemiddelde = (a + b + c ) / 3;

    }
    public void paint(Graphics g) {
        g.setColor(Color.white);
        String jaja = "het gemiddelde is "+ gemiddelde;
        g.drawString(jaja, 50, 50 );



    }
}
