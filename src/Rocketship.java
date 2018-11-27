import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Rocketship extends GameObjects implements KeyListener{

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

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			
			x -= speed;
			
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			x += speed;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
