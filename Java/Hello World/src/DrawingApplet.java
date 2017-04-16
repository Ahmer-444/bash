import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.*;


public class DrawingApplet extends Frame{
	 
	DrawingApplet(String title){
           
            super();         
            this.setTitle(title);          
            this.setVisible(true);
    }

public void paint(Graphics g){
	
    g.drawRect(10,10,50,100);
    g.drawRect(100,100,50,50);
}

public static void main(String[] args) {
// TODO Auto-generated method stub
	DrawingApplet window1 = new DrawingApplet("Rectangle Window");
	DrawingApplet2 window2 = new DrawingApplet2("Circle Window");
	//System.out.println("Hello World!!!");
}

}

class DrawingApplet2 extends Frame{

	DrawingApplet2(String title){
   
    super();         
    this.setTitle(title);
    this.setVisible(true);
	}

	public void paint(Graphics g){
	   
	//set color to red
	setForeground(Color.red);
	g.fillOval(100,50,100,100);
	
	}
}
