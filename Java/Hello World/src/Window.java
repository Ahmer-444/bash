
 
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.lang.*;
/*
 * To create a stand alone window, class should be extended from
 * Frame and not from Applet class.
 */
        
public class Window extends Frame{
	 
    Window(String title){
           
            //call the superclass constructor
            super();         
            //set window title using setTitle method
            this.setTitle(title);
           
            /*
             * Newly created window will not be displayed until we call
             * setVisible(true).
             */
            this.setVisible(true);
    }

    public void paint(Graphics g){
           
            /*
             * to draw rectangle in an applet window use,
             * void drawRect(int x1,int y1, int width, int height)
             * method.
             *
             * This method draws a rectangle of specified width and
             * height at (x1,y1)
             */
           
            //this will draw a rectangle of width 50 & height 100 at (10,10)
	        try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("rectangle Drawn!!!");
            g.drawRect(10,10,50,100);
            try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("rectangle erased!!!");
           
            /*
             * If you speficy same width and height, the drawRect method
             * will draw a square!
             */
           
            //this will draw a square
            g.drawRect(100,100,50,50);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Window window1 = new Window("Rectangle Window");
        Circle window2 = new Circle("Circle Window");
		//System.out.println("Hello World!!!");
	}

}

class Circle extends Frame{
	 
	Circle(String title){
           
            //call the superclass constructor
            super();         
            //set window title using setTitle method
            this.setTitle(title);
           
            /*
             * Newly created window will not be displayed until we call
             * setVisible(true).
             */
            this.setVisible(true);
    }

    public void paint(Graphics g){
           
        //set color to red
        setForeground(Color.red);
       
        /*
         * to draw a oval in an applet window use,
         * void drawOval(int x1,int y1, int width, int height)
         * method.
         *
         * This method draws a oval of specified width and
         * height at (x1,y1)
         */
       
        //this will draw a oval of width 50 & height 100 at (10,10)
        //g.drawOval(100,20,50,100);
       
       
        /*
         * To draw a filled oval use
         * fillOval(int x1,int y1, int width, int height)
         * method of Graphics class.
         */
       
        //draw filled oval
        g.fillOval(100,20,100,100);
        
    }
}
