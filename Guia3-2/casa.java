import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class casa extends JApplet {

  public void paint (Graphics c) {
    c.setColor(Color.blue);
    c.drawRect(155,155,25,15);
    c.drawRect(220,155,25,15);
    c.drawRect(190,170,20,25);
    c.setColor(Color.red);
    c.drawLine(150,150,200,130);
    c.drawLine(200,130,250,150);
    c.drawRect(150,150,100,50);
    }
  public static void main (String[] args){
    JFrame frame = new JFrame ("Casa en JApplet");
    casa FigurasApplet = new casa();
    FigurasApplet.init();
    frame.getContentPane().add(FigurasApplet);
    frame.setSize(500,600);
    frame.setVisible(true);
  }
}