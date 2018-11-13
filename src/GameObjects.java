import java.awt.Graphics;

public class GameObjects {

	int x;
	int y;
	int width;
	int height;
	
	GameObjects(int x, int y, int width, int height){
		
		this.x = x;	
		this.y = y;	
		this.width = width;	
		this.height = height;	
		
	}
	
	void update(){
		
		y += 1;

		
	}
	
	void draw(Graphics g) {
		
		g.fillRect(x, y, width, height);
		
		
	}
	
	
	
	
	
}
