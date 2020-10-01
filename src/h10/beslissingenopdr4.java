package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beslissingenopdr4 extends Applet {

    int getal,jaartal;
    TextField tekstvakje;
    String tekst;


    public void init() {

        tekstvakje = new TextField("",5);
        tekstvakje.addActionListener(new Vaklistener());

        tekst = "";

        add(tekstvakje);

    }


    public void paint(Graphics g) {

        g.drawString(tekst, 50,80);

    }
    class Vaklistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String s;

            s = tekstvakje.getText();
            getal = Integer.parseInt(s);

            if (getal == 1){
                tekst = "maand"+ getal + "is januari. en januari heeft 31 dagen";
            }
            if (getal == 2){
                tekst = "maand"+ getal + "is februari. en heeft 28 dagen";
            }
            if (getal == 3){
                tekst = "maand"+ getal + "is maart. en heeft 31 dagen";
            }
            if (getal == 4){
                tekst = "maand"+ getal + "is april. en april heeft 30 dagen";
            }
            if (getal == 5){
                tekst = "maand"+ getal + "is mei. en heeft 31 dagen";
            }
            if (getal == 6){
                tekst = "maand"+ getal + "is juni. en heeft 30 dagen";
            }
            if (getal == 7){
                tekst = "maand"+ getal + "is juli. en juli heeft 31 dagen";
            }
            if (getal == 8){
                tekst = "maand"+ getal + "is augustus. en heeft 31 dagen";
            }
            if (getal == 9){
                tekst = "maand"+ getal + "is september. en heeft 30 dagen";
            }
            if (getal == 10){
                tekst = "maand"+ getal + "is oktober. en april heeft 31 dagen";
            }
            if (getal == 11){
                tekst = "maand"+ getal + "is november. en heeft 30 dagen";
            }
            if (getal == 12){
                tekst = "maand"+ getal + "is december. en heeft 31dagen";
            }
            if (getal > 1000){
                jaartal = getal;
            }
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
