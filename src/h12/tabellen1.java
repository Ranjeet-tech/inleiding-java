package h12;

import java.applet.Applet;
import java.awt.*;

public class tabellen1 extends Applet {

    int salaris[];
    Label stickertje;

    public void init() {
        salaris = new int [10];
        stickertje = new Label("het gemiddelde is 5,5");

        add(stickertje);

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 1 * teller + 1;
        }
    }

    public void paint(Graphics g) {

        stickertje.setLocation(100,50);

        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

        }
    }
}



