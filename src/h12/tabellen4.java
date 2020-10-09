package h12;

import java.applet.Applet;
import java.awt.*;

public class tabellen4 extends Applet {

    int getallen[], magicnumber = 10;
    boolean gevonden;
    int gezocht, index;


    public void init() {

        getallen = new int[magicnumber];
        gezocht = 6;

        for (int i = 0; i < magicnumber; i++) {

            getallen[i] = 1 * i + 1;

        }
        for (int i = 0; i < magicnumber; i++) {
            if (getallen[i]==gezocht){
                gevonden = true;
                index = i;
                break;
            }
        }
    }

    public void paint(Graphics g) {

        for (int i = 0; i < magicnumber; i++) {
            g.drawString(""+getallen[i],50,i * 20 + 20);
        }
        if (gevonden){

            g.drawString("ja hij is gevonden bij "+ index,50 , 250);
        }


    }
}