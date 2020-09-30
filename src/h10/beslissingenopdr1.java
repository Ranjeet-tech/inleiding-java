package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class beslissingenopdr1 extends Applet {

    int leeftijd, hoogste;
    TextField tekstvakje;
    Label stickertje;
    String tekst;


    public void init() {

        tekstvakje = new TextField("", 5);
        tekstvakje.addActionListener(new Vaklistener());
        tekst = "";

        stickertje = new Label("geef uw leeftijd en klik op enter");

        add(stickertje);
        add(tekstvakje);

    }


    public void paint(Graphics g) {

        g.drawString(tekst, 50,45);


    }

    class Vaklistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            String s;

            s = tekstvakje.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd > hoogste) {
                hoogste = leeftijd;

            }
            else {
                tekst = "u bent minderjarig";
            }
            tekst = hoogste + "is het hoogste getal dat is ingevoerd.";
            repaint();
        }
    }
}


