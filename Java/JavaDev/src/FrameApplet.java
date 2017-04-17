import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.*;


public class FrameApplet extends Frame{
	 
	FrameApplet(String title){
           
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
	FrameApplet window1 = new FrameApplet("Rectangle Window");
	FrameApplet2 window2 = new FrameApplet2("Circle Window");
	//System.out.println("Hello World!!!");
}

}

class FrameApplet2 extends Frame{

	FrameApplet2(String title){
   
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