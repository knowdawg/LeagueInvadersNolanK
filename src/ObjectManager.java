import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {

	Rocketship player;
	ArrayList<Lazer> lazers = new ArrayList<Lazer>();
	
	ObjectManager (Rocketship bill){
		
		this.player = bill;
		
	}
	
	void update(){
		
		player.update();
		
		for (Lazer lazer : lazers) {
					
					lazer.update();
					
				}

		
	}
	
	void draw(Graphics g) {
		
		player.draw(g);
		
		for (Lazer lazer : lazers) {
			
			lazer.draw(g);
			
		}
		
	}
	
	void addLazer(Lazer newLazer) {
		
		
						
				lazers.add(newLazer);
						
					
					
				}
		
	}
			
	

