import java.awt.Color;
import java.awt.Graphics;

public class Lazer extends GameObjects{
	
	int speed = 10;

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
		
		g.setColor(Color.RED);

        g.fillRect(x, y, width, height);


		
	}
	
	
	
}
