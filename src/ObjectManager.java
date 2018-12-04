import java.awt.Graphics;

public class ObjectManager {

	Rocketship bob;
	Lazer[] lazers = new Lazer[0];
	
	ObjectManager (Rocketship bill){
		
		this.bob = bill;
		
	}
	
	void update(){
		
		bob.update();
		
	}
	
	void draw(Graphics g) {
		
		bob.draw(g);
		
	}
	
	void addLazer() {
		
		Lazer[] temp = new Lazer[lazers.length];
		
		for (int i = 0; i < lazers.length; i++) {
			
			lazers[i] = temp[i];
			
		}
		
		Lazer[] lazers = new Lazer[temp.length + 1];
		//finish this
		
		
	}
			
	
}
