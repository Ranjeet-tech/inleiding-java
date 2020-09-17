package h05;

import java.applet.Applet;
import java.awt.*;

public class variabelenopdracht1 extends Applet {

    // variabelen voor de lijn
    int afstand;

    // variabelen voor de rechthoek
    int breedte1, hoogte1;

    // variabelen voor afgeronde rechthoek
    int breedte2, hoogte2;

    // kleur voor de gevulde ovaal
    int kleur1;

    // kleurvariabelen
    Color Ovaalkleur = Color.MAGENTA;


    public void init() {
        afstand = 300;
        breedte1 = 200;
        hoogte1 = 100;
        breedte2 = 200;
        hoogte2 = 100;


    }


    public void paint(Graphics g) {

        g.drawLine(10,30,afstand,30);
        g.drawString("lijn", 100,50);

        g.drawRect(10,60,breedte1,hoogte1);
        g.drawString("rechthoek",85,180 );

        g.drawRoundRect(10,200,breedte2,hoogte2,25,25);
        g.drawString("afgeronde rechthoek", 55, 320);

        g.setColor(Ovaalkleur);
        g.fillRect(220,60,200,100);
        g.setColor(Color.black);
        g.drawOval(220,60,200,100);

        g.setColor(Ovaalkleur);
        g.fillOval(220, 200,200,100);

        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal",280,180 );
        g.drawString("gevulde ovaal",280,320 );

        g.drawOval(470,200,100,100);
        g.drawString("cirkel",500,320 );

    }
}
