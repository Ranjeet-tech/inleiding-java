package h11;

import java.applet.Applet;
import java.awt.*;

public class herhaling9 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);


        int x = 50, y = 50;

        // de eerste rij

        for (int kolom = 0; kolom < 8; kolom++) {

            if ( kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6){

                g.setColor(Color.BLACK);
                g.fillRect(x, y, 50, 50);
            }
            else {
                g.setColor(Color.white);
                g.fillRect(x,y,50,50);
            }
            x+= 50;
        }
        // de tweede rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de derde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de vierde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de vijfde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de zesde rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de zevende rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
        // de achtste rij
        x = 50;
        y += 50;

        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {

                g.setColor(Color.white);
                g.fillRect(x, y, 50, 50);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, 50, 50);
            }
            x += 50;
        }
    }
}
