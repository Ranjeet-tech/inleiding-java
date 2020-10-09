package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class tabellen3 extends Applet {

    TextField tekstvakje[], tekstvakje1;
    Button knopje;
    int getallen[], magicnumber = 7;


    public void init() {

        getallen = new int[magicnumber];


        knopje = new Button("Ok");
        knopje.addActionListener(new Knoplistener());

        tekstvakje = new TextField[magicnumber];
        tekstvakje1= new TextField("");

        for (int i = 0; i < magicnumber; i++) {

            tekstvakje[i] = new TextField("");
            getallen[i] = 0;

            add(tekstvakje[i]);
        }
        add(knopje);
    }


    public void paint(Graphics g) {

        knopje.setLocation(50,50);
    }

    class Knoplistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < magicnumber; i++) {


                getallen[i] = Integer.parseInt(tekstvakje[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < magicnumber; i++) {
                tekstvakje[i].setText(getallen[i]+"");
            }
        }
    }
}
