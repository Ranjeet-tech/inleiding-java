package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class knoppentekstvakken1 extends Applet {

    Button knop;
    TextField tekstvak;
    Label stickertje;
    int counter;
    Color backgroundcolor;
    double getal1;

    public void init() {

        counter = 1;
        backgroundcolor = Color.pink;

        stickertje = new Label("ik ben een label");
        knop = new Button("klik op mij");
        tekstvak = new TextField("", 30);
        add(tekstvak);
        add(knop);
        add(stickertje);

        knop.addActionListener(new Knoplistener());

    }

    public void paint(Graphics g) {

        setBackground(backgroundcolor);

        knop.setLocation(20, 20);
        knop.setSize(300, 40);

        tekstvak.setLocation(20, 65);
        tekstvak.setSize(300, 40);

        stickertje.setLocation(20,130 );
        stickertje.setSize(300, 30 );


    }

    class Knoplistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            counter++;
            backgroundcolor = Color.MAGENTA;

            String message = tekstvak.getText();
            knop.setLabel(message);
            stickertje.setText(message);

        }
    }

}