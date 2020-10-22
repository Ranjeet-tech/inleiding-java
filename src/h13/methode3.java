package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class methode3 extends Applet {

    Button knopje1, knopje2;

    boolean baksteenRood = false;


    public void init() {

        knopje1 = new Button("rode bakstenen");
        knopje2 = new Button("grijze stenen");
        add(knopje1);
        add(knopje2);

        knopje1.addActionListener(new Rodemuur());
        knopje2.addActionListener(new grijzemuur());


    }


    public void paint(Graphics g) {

        if (baksteenRood = false){

            tekenrodebaksteenmuur(g,5,10);
        }
        else{
            tekengrijzemuur(g,5,10);
        }

    }

    void Tekenrodebaksteen (Graphics g, int x, int y, int width, int height ){
        g.setColor(Color.red);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);
    }

    void tekenrodebaksteenmuur(Graphics g, int rows, int columns) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Tekenrodebaksteen(g, 10+i*100, 10+i*10, 100, 50);
            }
        }
    }
    void tekengrijzesteen(Graphics g, int x, int y, int width, int height){

        g.setColor(Color.darkGray);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);

    }
    void tekengrijzemuur(Graphics g,int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tekengrijzesteen(g, 10+i*100, 10+j*50, 100,50);
            }

        }
    }
}


    class Rodemuur implements ActionListener{

        public void actionPerformed(ActionEvent e) {




        }
    }

    class grijzemuur implements ActionListener{

        public void actionPerformed(ActionEvent e) {


        }
    }
