import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rocketship extends GameObjects{

	int speed;
	
	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		speed = 5;
		
	}

	void update() {
		
		super.update();
		
	
		
	}
		
	
	
	void draw(Graphics g) {
		
		g.setColor(Color.BLUE);

        g.fillRect(x, y, width, height);


		
	}


}
