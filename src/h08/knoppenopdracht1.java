package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class knoppenopdracht1 extends Applet {

    Button knop;
    Button knop2;
    TextField tekstvak;
    Label stickertje;

    public void init() {

        knop = new Button("OK");
        knop2 = new Button("reset");
        tekstvak = new TextField("", 30);
        stickertje = new Label();
        add(tekstvak);
        add(knop);
        add(knop2);
        add(stickertje);
        knop.addActionListener(new Okknop());
        knop2.addActionListener(new Resetknop());


    }


    public void paint(Graphics g) {

        setBackground(Color.darkGray);
        stickertje.setLocation(35, 35);
        stickertje.setSize(300, 30);

    }


    class Okknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String message = tekstvak.getText();
            stickertje.setText(message);


        }
    }

    class Resetknop implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stickertje.setText("");
            tekstvak.setText("");

        }
    }

}