package _05_Polymorphs;

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
		// TODO Auto-generated method stub
		
	}

}
