package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beslissingenopdr5 extends Applet {

    int een,twee,drie;
    double vier;
    TextField tekstvakje1, tekstvakje2, tekstvakje3;
    Label cijfer1, cijfer2, cijfer3, cijfer4 ;
    Button ok;
    String tekst;


    public void init() {

        tekstvakje1 = new TextField("",5);
        tekstvakje2 = new TextField("",5);
        tekstvakje3 = new TextField("",5);
        tekstvakje1.addActionListener(new Knoplistener());
        tekstvakje2.addActionListener(new Knoplistener());
        tekstvakje3.addActionListener(new Knoplistener());
        tekst = "";


        cijfer1 = new Label("cijfer1");
        cijfer2 = new Label("cijfer2");
        cijfer3 = new Label("cijfer3");
        cijfer4 = new Label("");

        ok = new Button("ok");
        ok.addActionListener(new Knoplistener());

        add(tekstvakje1);
        add(tekstvakje2);
        add(tekstvakje3);
        add(cijfer1);
        add(cijfer2);
        add(cijfer3);
        add(ok);
        add(cijfer4);

    }
    public void paint(Graphics g) {



        tekstvakje1.setLocation(100,50);
        tekstvakje2.setLocation(100,80);
        tekstvakje3.setLocation(100,110);

        cijfer1.setLocation(50, 50);
        cijfer2.setLocation(50, 80);
        cijfer3.setLocation(50, 110);
        cijfer4.setLocation(50,140);

        g.drawString(tekst, 200, 150);
        ok.setLocation(100,140);

    }

    class Knoplistener implements ActionListener{

        public void actionPerformed(ActionEvent e) {



            String S,D,P;
            int aantalIngevuldeCijfers = 0;

            S = tekstvakje1.getText();

            D = tekstvakje2.getText();

            P = tekstvakje3.getText();

            if (!S.equals("")) {
                een = Integer.parseInt(S); aantalIngevuldeCijfers++;
            }
            if (!D.equals("")){
                twee = Integer.parseInt(D); aantalIngevuldeCijfers++;
            }
            if (!P.equals("")) {
                drie = Integer.parseInt(P); aantalIngevuldeCijfers++;
            }

            vier =(double) (een + twee + drie) / aantalIngevuldeCijfers;

            tekst = vier+"";
            repaint();


        }

    }

}
