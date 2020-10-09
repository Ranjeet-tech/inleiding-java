package h12;

import java.applet.Applet;
import java.awt.*;

public class tabellen6 extends Applet {

    int getallen[], magicnumber = 10, gezocht, index;
    boolean gevonden;



    public void init() {
        getallen = new int[magicnumber];
        gezocht = 1;


        for (int i = 1; i < magicnumber; i++) {

            getallen[i] = 1 * i;

        }
        for (int i = 1; i < magicnumber; i++) {
            if (getallen[i]==gezocht){
                gevonden = true;
                index = i++;

            }
        }

    }


    public void paint(Graphics g) {

        for (int i = 1; i < magicnumber; i++) {
            g.drawString(""+getallen[i],50,i * 20 + 20);
        }
        if (gevonden){

            g.drawString("ja hij is"+index+"keer gevonden",50 , 250);
        }

    }
}
