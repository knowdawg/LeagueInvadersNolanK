import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	
	int score = 0;
	long enemyTimer = 0;
	int enemySpawnTime = 100;
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
		
		for (int a = 0; a < aliens.size(); a ++) {
			
			if (aliens.get(a).isAlive == false) {
				
				aliens.remove(a);
				score += 1;
                System.out.println(score);
				
			}
			
		}
		
		
for (int a = 0; a < lazers.size(); a ++) {
			
			if (lazers.get(a).isAlive == false) {
				
				lazers.remove(a);
				
			}
			
		}
		
		
		
	}
	
	void checkCollision() {
		
		for(Alien a : aliens){

	        if(player.collisionBox.intersects(a.collisionBox)){

	        	
	        	
	                player.isAlive = false;
	       
	                
	             	/*for(Alien b : aliens){
	             		aliens.remove(b);
	             		
	             	}*/
	               

	        }
	        
	        for(Lazer l : lazers){

	        	for(Alien b : aliens){
	        	
		        if(b.collisionBox.intersects(l.collisionBox)){

		                b.isAlive = false;
		                l.isAlive = false;
		                
		                

		        }
	        	}
	}


		
		
	}
	}
}
	

	
	
	
	
		

			
	


