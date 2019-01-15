import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Lazer extends GameObjects{
	

	
	int speed = 100;

	Lazer(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
void update() {
		
		super.update();
		
		y -= speed;
		
		if(y < 0) {
			
			isAlive = false;
			
		}
	
		
	}
		
	
	
	void draw(Graphics g) {
		
		g.drawImage(GamePanel.bulletImg, x, y, width, height, null);



		
	}
	
	
	
}
