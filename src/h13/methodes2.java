package h13;

import java.applet.Applet;
import java.awt.*;

public class methodes2 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

     tekenmuur(g,5,10);

    }
    void tekenBaksteen (Graphics g, int x, int y, int width, int height ){

        g.setColor(Color.darkGray);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);

    }

    void tekenmuur (Graphics g, int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tekenBaksteen(g,10+i*100,10+j*50,100,50);
            }

        }
    }
}
