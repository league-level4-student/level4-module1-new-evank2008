package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	Random ran = new Random();

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x=ran.nextInt(PolymorphWindow.WIDTH);
		y=ran.nextInt(PolymorphWindow.HEIGHT);
	}

	@Override
	public void draw(Graphics g) {
		if(ran.nextInt(10)!=2) {return;}
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

}
