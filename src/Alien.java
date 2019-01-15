import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObjects{

	Random randy = new Random();
	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

void update() {
		
	super.update();
		
	if (randy.nextInt(5) > 1) {
	y += randy.nextInt(20)-7;
	x += randy.nextInt(20)-10;

	}
	}
		
	
	
	void draw(Graphics g) {
		
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);


		
	}
	
	
}
