package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
//STEP 12 RAHHHHHHHHH
/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 * 
 * 2. Encapsulate the member variables of the Polymorph class. 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * 
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 */

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {

    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;

    private JFrame window;
    private Timer timer;
    
    int mouseX=0;
    int mouseY=0;

ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
Polymorph customCursor;
    
    public static void main(String[] args) {
        new PolymorphWindow().buildWindow();
    }

    public void buildWindow() {
    	customCursor = new RedPolymorph(-100,-100,100,100);
        window = new JFrame("IT'S MORPHINE TIME!");
        window.addMouseMotionListener(this);
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(500, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
        
        timer = new Timer(1000 / 30, this);
        timer.start();
        
        morphs.add(new BluePolymorph(0, 0, 50, 400));
        morphs.add (new RedPolymorph(50, 200, 200, 8));
        morphs.add (new BluePolymorph(2, 400, 400, 400));
        morphs.add(new MovingMorph(0,0,100,100));
        morphs.add(customCursor);
        
    }

    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 500, 500);

        for (Polymorph p:morphs) {
        	p.draw(g);
        	p.update();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();


    }

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("mouse dragged");
		customCursor.x=arg0.getX();
		customCursor.y=arg0.getY()-30;
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		System.out.println("mouse moved");
		// TODO Auto-generated method stub
		
		
		
		
	}
}
