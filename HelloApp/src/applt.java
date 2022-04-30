import java.applet.Applet;

import java.applet.*;
import java.awt.*;
import java.net.PortUnreachableException;

public class applt extends JApplet implements ActionListener {

    public void inti(){
       
          setBackground(Color.BLACK);
          setForeground(Color.yellow);

    }

    public void paint(Graphics g){
        g.drawString("iterator", 40, 40);
    }
    
}
