package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;

public class tabellen2 extends Applet {

    Button knopje[];


    public void init() {

        knopje = new Button[25];

        for (int i = 0; i < 25; i++) {
            knopje[i] = new Button("ok");

            add(knopje[i]);

        }

        }


    public void paint(Graphics g) {

        }
    }
