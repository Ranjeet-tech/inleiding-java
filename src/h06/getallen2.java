package h06;

import java.applet.Applet;
import java.awt.*;

public class getallen2 extends Applet {

    //namen variabelen die nodig zijn
    int seconden, uren, dagen, jaar, minuten;


    public void init() {
        setBackground(Color.darkGray);
        seconden = 1;
        minuten = seconden * 60;
        uren = minuten * 60;
        dagen = uren * 24;
        jaar = dagen * 365;


    }


    public void paint(Graphics g) {
        g.setColor(Color.white);

        String uur = "een uur bestaat uit "+ uren+ " seconden";
        g.drawString(uur, 50, 50);

        String dag = "een dag bestaat uit "+ dagen+ "seconden";
        g.drawString(dag, 50, 70);

        String jaren = "een jaar bestaat uit "+ jaar+ "seconden";
        g.drawString(jaren, 50, 90);






    }
}
