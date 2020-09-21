package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {

    Button plus;
    Button min;
    Button divide;
    Button multiply;
    TextField tekstvakje1;
    TextField tekstvakje2;
    Label stickertje;
    double getal1, getal2, uitkomst1, uitkomst2, uitkomst3, uitkomst4;

    public void init() {

        plus = new Button("+");
        min = new Button("-");
        divide = new Button("/");
        multiply = new Button("*");
        tekstvakje1 = new TextField("",30);
        tekstvakje2 = new TextField("",30);
        stickertje = new Label("") ;
        add(plus);
        add(min);
        add(divide);
        add(multiply);
        add(tekstvakje1);
        add(tekstvakje2);
        add(stickertje);



        plus.addActionListener(new plusknop());
        min.addActionListener(new minknop());
        divide.addActionListener(new deelknop());
        multiply.addActionListener(new keerknop());


    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.black);

        tekstvakje1.setLocation(20,50);

        tekstvakje2.setLocation(20,80);

        stickertje.setLocation(20, 110);
        stickertje.setSize(233,20);


    }

    class plusknop implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            String s = tekstvakje1.getText();
            getal1 = Double.parseDouble(s);

            String ss = tekstvakje2.getText();
            getal2 = Double.parseDouble(ss);
            uitkomst1 = getal1 + getal2;


            stickertje.setText(""+uitkomst1);

        }
    }

    class minknop implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s = tekstvakje1.getText();
            getal1 = Double.parseDouble(s);

            String ss = tekstvakje2.getText();
            getal2 = Double.parseDouble(ss);
            uitkomst2 = getal1 - getal2;

            stickertje.setText(""+uitkomst2);

        }
    }

    class deelknop implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s = tekstvakje1.getText();
            getal1 = Double.parseDouble(s);

            String ss = tekstvakje2.getText();
            getal2 = Double.parseDouble(ss);
            uitkomst4 = getal1 / getal2;

            stickertje.setText(""+uitkomst4);

        }
    }

    class keerknop implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            String s = tekstvakje1.getText();
            getal1 = Double.parseDouble(s);

            String ss = tekstvakje2.getText();
            getal2 = Double.parseDouble(ss);
            uitkomst3 = getal1 * getal2;

            stickertje.setText(""+uitkomst3);

        }
    }
}
