import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;



public class ThreadApplet implements Runnable {

   Thread t;

   public void run() {
	   System.out.println("Rectangle Applet Initiated!!!");
	   while(true){
		    rectangle_junk rect = new rectangle_junk();
		    rect.rectangle_method();   
	   }
	   //Rectangle window1 = new Rectangle("Rectangle Window");
    }
   
   public static void main(String[] args) throws Exception {
	      Thread t = new Thread(new ThreadApplet());
	      // this will call run() function
	      t.start();

	      Thread t2 = new Thread(new ThreadApplet2());
	      // this will call run() function
	      t2.start();
	   }

}


class ThreadApplet2 implements Runnable {

	   Thread t;

	   public void run() {
		   System.out.println("Circle Applet Initiated!!!");
		   while(true){
			    circle_junk circ = new circle_junk();
			    circ.circle_method();   
		   }

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
        	System.out.println(Thread.currentThread().getName() + "  " + "Circle Thread!!!");
        	g.fillOval(100,20,100,100);
        	System.out.println("Circle Drawn!!!");
            
        	try {
 			Thread.sleep(4000);
            } catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
            }
        	setForeground(Color.white);
           	g.fillOval(100,20,100,100);
        	System.out.println("Circle Erased!!!");
            
        	try {
 			Thread.sleep(4000);
            } catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
            }
        	
        }
         
        //this will draw a oval of width 50 & height 100 at (10,10)
        //g.drawOval(100,20,50,100);
       
        //draw filled oval
        
        
}
class Rectangle extends Frame{
	 
	Rectangle(String title){
           
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
    	
           //this will draw a rectangle of width 50 & height 100 at (10,10)
       	   System.out.println(Thread.currentThread().getName() + "  " + "Rectangle Thread!!!");
           g.drawRect(10,10,50,100);
           System.out.println("rectangle Drawn!!!");

           try {
			Thread.sleep(4000);
           } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
           }
           
           //this will draw a square
           g.clearRect(100,100,50,50);
           System.out.println("rectangle erased!!!");
           try {
			Thread.sleep(4000);
           } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
           }

       }
}
class circle_junk{
	  circle_junk() {
		  System.out.println(Thread.currentThread().getName() + "  " + "Circle Thread!!!");
		  }
    //this will draw a rectangle of width 50 & height 100 at (10,10)
	void circle_method()
	{
		System.out.println("circle Drawn!!!");
	    try {
			Thread.sleep(4000);
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	    System.out.println("circle erased!!!");
	    try {
			Thread.sleep(4000);
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }

	}

}

class rectangle_junk{
	  rectangle_junk() {
		  System.out.println(Thread.currentThread().getName() + "  " + "Rectangle Thread!!!");
		  }
  //this will draw a rectangle of width 50 & height 100 at (10,10)
	void rectangle_method()
	{
		System.out.println("rectangle Drawn!!!");
	    try {
			Thread.sleep(4000);
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	    System.out.println("rectangle erased!!!");
	    try {
			Thread.sleep(4000);
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }

	}

}