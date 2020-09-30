package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class beslissingenopdr2 extends Applet {

    int leeftijd, hoogste, laagste;
    TextField tekstvakje;
    Label stickertje;
    String tekst, tekst2;


    public void init() {

        tekstvakje = new TextField("",5);
        tekstvakje.addActionListener(new Vaklistener());
        tekst = "";
        tekst2 = "";

        stickertje = new Label("geef uw leeftijd en klik op enter");

        add(stickertje);
        add(tekstvakje);

    }


    public void paint(Graphics g) {

        g.drawString(tekst, 50,45);
        g.drawString(tekst2, 50 ,75);


    }

    class Vaklistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            String s;

            s = tekstvakje.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd > hoogste) {
                hoogste = leeftijd;

            }

            if (leeftijd < laagste) {
                laagste = leeftijd;

            }
            tekst = hoogste + "is het hoogste getal dat is ingevoerd.";
            tekst2 = laagste+ "is het laagste getal dat is ingevoerd";
            repaint();
        }
    }
}
