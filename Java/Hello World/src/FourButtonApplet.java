
import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class FourButtonApplet extends Applet implements ActionListener{

public void init(){
       
       
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        button1.setLabel("Start");
        button2.setLabel("Sync");
        button3.setLabel("Unsync");
        button4.setLabel("Stop");
       
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
	//System.out.println(e.getActionCommand());
	if (e.getActionCommand() == "Start") 
		System.out.println("Start Button was pressed");
	else if(e.getActionCommand() == "Sync")
		System.out.println("Synchroized Button was pressed");
	else if(e.getActionCommand() == "Unsync")
		System.out.println("UnSynchronized Button was pressed");
	else
		System.out.println("Stop Button was pressed");
}
public void paint(Graphics g){
    
    setForeground(Color.blue);
    //this will draw a filled rectangle of width 50 & height 100 at (10,10)
    g.drawRect(40,60,50,100);
    g.fillRect(100,100,50,50);
}
Button button1, button2,button3,button4;
}
