import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingApplets2 extends Applet {
	  public void init() {

		    Frame title = (Frame)this.getParent().getParent();
		    title.setTitle("Circle Applet");
		  }


public void paint(Graphics g){
    
    setForeground(Color.blue);
    //this will draw a filled rectangle of width 50 & height 100 at (10,10)
    g.drawOval(50,50,50,100);
    g.fillOval(100,50,100,100);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
		DrawingApplets2 window1 = new DrawingApplets2();
		//DrawingApplets2 window2 = new DrawingApplets2();
		//System.out.println("Hello World!!!");
	}

}