package h11;

import java.applet.Applet;
import java.awt.*;

public class herhaling7 extends Applet {

    int i=175,j=175;


    public void init() {

    }

    public void paint(Graphics g)
    {

        while(i>=30)
        {
            g.drawOval(i,i,j,j);
            i = i - 10;
            j = j + 20;
        }
    }
}
