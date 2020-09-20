package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class knoppenopdracht2 extends Applet {

    Button man;
    Button vrouw;
    Button potentieleman;
    Button potentielevrouw;
    int counter1, counter2, counter3, counter4, counter5;
    Label stickertje;


    public void init() {

        man = new Button("man");
        vrouw = new Button("vrouw");
        potentieleman = new Button("potentiele man");
        potentielevrouw = new Button("potentiele vrouw");
        stickertje = new Label();
        add(man);
        add(vrouw);
        add(potentieleman);
        add(potentielevrouw);
        add(stickertje);
        counter1 = 1;
        counter2 = 1;
        counter3 = 1;
        counter4 = 1;
        counter5 = 1;
        man.addActionListener(new man());
        vrouw.addActionListener(new vrouw());
        potentieleman.addActionListener(new potentieleman());
        potentielevrouw.addActionListener(new potentielevrouw());


    }


    public void paint(Graphics g) {
        setBackground(Color.darkGray);

        stickertje.setLocation(20 , 220);
        stickertje.setSize(300, 40);
        stickertje.setText("hoeveel mensen zijn er totaal");

        man.setLocation(20, 20);
        man.setSize(300, 40);
        man.setLabel("hoeveel mannen zijn er binnen");

        vrouw.setLocation(20,70);
        vrouw.setSize(300, 40);
        vrouw.setLabel("hoeveel vrouwen zijn er binnen");

        potentielevrouw.setLocation(20 , 120);
        potentielevrouw.setSize(300, 40);
        potentielevrouw.setLabel("hoeveel potentiele mannen zijn er binnen");

        potentieleman.setLocation(20, 170);
        potentieleman.setSize(300, 40);
        potentieleman.setLabel("hoeveel potentiele vrouwen zijn er binnen");


    }
    class man implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter1++;
            man.setLabel("er zijn "+ counter1+"mannen binnen");
            stickertje.setText("er zijn in totaal"+counter5+"mensen in het gebouw");
        }
    }
    class vrouw implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter2++;
            vrouw.setLabel("er zijn "+ counter2+"mannen binnen");
            stickertje.setText("er zijn in totaal"+counter5+"mensen in het gebouw");
        }
    }
    class potentieleman implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter3++;
            potentieleman.setLabel("er zijn "+ counter3+"mannen binnen");
            stickertje.setText("er zijn in totaal"+counter5+"mensen in het gebouw");
        }
    }
    class potentielevrouw implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter4++;
            potentielevrouw.setLabel("er zijn "+ counter4+"vrouwen binnen");
            stickertje.setText("er zijn in totaal"+counter5+"mensen in het gebouw");
        }
    }
}
