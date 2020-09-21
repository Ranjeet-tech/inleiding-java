package h08;

import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class knoppenopdracht3 extends Applet {

    Button okeknop;
    TextField tekstvakje;
    Label stickertje;
    int totaal, btw1, btw2;


    public void init() {


        totaal = 100;
        btw1 = totaal / 100 * 21;
        btw2 = totaal / 100 * 81;
        okeknop = new Button("OK");
        tekstvakje = new TextField(""+ totaal, 25);
        stickertje = new Label("");
        add(okeknop);
        add(tekstvakje);
        add(stickertje);
        okeknop.addActionListener(new okeknop());
        totaal = btw1 + btw2;





    }

    public void paint(Graphics g) {

        setBackground(Color.PINK);

        stickertje.setSize(300, 20);
        stickertje.setLocation(40, 50);

    }


    class okeknop implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            String message = tekstvakje.getText();
            stickertje.setText(message+"  inclusief BTW. BTW ="+ btw1);
            tekstvakje.setText("");


        }
    }
}

