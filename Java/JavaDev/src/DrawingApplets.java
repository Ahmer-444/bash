import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingApplets extends Applet {
	  public void init() {

		    Frame title = (Frame)this.getParent().getParent();
		    title.setTitle("Rectangle Applet");
		  }


public void paint(Graphics g){
    
    setForeground(Color.blue);
    //this will draw a filled rectangle of width 50 & height 100 at (10,10)
    g.drawRect(40,60,50,100);
    g.fillRect(100,100,50,50);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
		DrawingApplets window1 = new DrawingApplets();
		//DrawingApplets2 window2 = new DrawingApplets2();
		System.out.println("Hello World!!!");
	}

}