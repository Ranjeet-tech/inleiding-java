package h11;

import java.applet.Applet;
import java.awt.*;

public class herhaling8 extends Applet {

    int j = 175,i= 175;


    public void init() {

        setSize(1000,1000);

    }
        public void paint(Graphics g)
        {

            while(j >= 175 && j < 550)
            {
                g.drawOval(i,i,j,j);

                j = j + 20;
            }
    }
}
