import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	
	long enemyTimer = 0;
	int enemySpawnTime = 200;
	Rocketship player;
	ArrayList<Lazer> lazers = new ArrayList<Lazer>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	
	ObjectManager (Rocketship bill){
		
		this.player = bill;
		
	}
	
	void update(){
		
		player.update();
		
		for (Lazer lazer : lazers) {
					
					lazer.update();
					
				}
	
		for (Alien alien : aliens) {
			
			System.out.println(alien.y);
			alien.update();
			
		}

		
	}
	
	void draw(Graphics g) {
		
		player.draw(g);
		
		for (Lazer lazer : lazers) {
			
			lazer.draw(g);
			
		}
		
		for (Alien alien : aliens) {
					
					alien.draw(g);
					
				}
		
	}
	
	void addLazer(Lazer newLazer) {
		
		
						
				lazers.add(newLazer);
						
					
					
	}
	
	void addAlien(Alien newAlien) {
		
		
		
		aliens.add(newAlien);
				
			
			
}
	
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));


enemyTimer = System.currentTimeMillis();
        }
}
	
	void purgeObjects() {
		
		
		
	}
	
	
	}
		

			
	


