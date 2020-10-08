package h05;

import java.applet.Applet;
import java.awt.*;

public class variabelen1 extends Applet {

    // een int is een stukje geheugen voor een geheel getal
    int getal1, getal2, optelsom;

    // een double is een stukje geheugen voor een kommagetal
    double factor1, factor2, product;

    // variabelen voor de rechthoek
    int breedte, hoogte;

    public void init() {
        setBackground(Color.darkGray);
        getal1 = 7;
        getal2 = 23;
        factor1 = 33.4;
        factor2 = 18.8;
        optelsom = getal1 + getal2;
        product = factor1 * factor2;
        breedte = 200;
        hoogte = 80;


    }
    public void paint(Graphics g) {
        g.setColor(Color.white);

        String optelsomstring = getal1 + " + " + getal2 + " = " + optelsom;
        g.drawString(optelsomstring, 50, 50 );

        String keersomstring = factor1 + " + " + factor2 + " = " + product;
        g.drawString(keersomstring, 50, 70);

        g.setColor(Color.red);

        g.fillRect(50, 90, breedte, hoogte);

    }
}
