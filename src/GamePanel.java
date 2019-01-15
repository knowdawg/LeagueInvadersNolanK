import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

	public static BufferedImage alienImg;

    public static BufferedImage rocketImg;

    public static BufferedImage bulletImg;

    public static BufferedImage spaceImg;


  int speed = 10;
  boolean isMoving = false;
  Timer timer;
  GameObjects object;
  final int MENU_STATE = 0;
  final int GAME_STATE = 1;
  final int END_STATE = 2;
  int currentState = MENU_STATE;
  Font titleFont = new Font("Arial", Font.PLAIN, 48);
  Rocketship player = new Rocketship(250,700,50,50);
  ObjectManager fred = new ObjectManager(player);
  Random makeThemCool = new Random();
  
  
  @Override

  public void paintComponent(Graphics g){

	  object.draw(g);
	  
	  
	  if(currentState == MENU_STATE){

          drawMenuState(g);
          
  }else if(currentState == GAME_STATE){
	  		

          drawGameState(g);
          
  }else if(currentState == END_STATE){

          drawEndState(g);
          
  }

          }
	GamePanel(){
		
		timer = new Timer(1000 / 60, this);
		object = new GameObjects(10,10,100,100);
		
		try {

            alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));

            rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));

            bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));

            spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));

    } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

    }


		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		repaint();
		object.update();
		
		if(currentState == MENU_STATE){

            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

            updateEndState();

    }
		
		
	}
	
	void startGame() {
		
		timer.start();
		
	}
	
	void updateMenuState() {
		
		
		
	}
	
void updateGameState() {
		
		fred.update();
		fred.checkCollision();
		fred.purgeObjects();
		purgeEverything();
		
//if(isMoving) {
			if(player.x > 10) {
			
			player.x += speed;
			} else {
				
				player.x += 5;
				
			}
		 
			
		
			
			
		//}
		
  fred.manageEnemies();

	}




void updateEndState() {
	
	
	
}

void drawMenuState(Graphics g) {
	
	
	
	g.setColor(Color.BLUE);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	
	
g.setColor(Color.green);
	
	g.setFont(titleFont);
	 g.drawString("LEAGUE INVADERS", 30, 50);
	 g.setFont(titleFont);
	 g.drawString("(A space invaders", 50, 100);
	 g.drawString("rip-off)", 150, 150);
	 g.drawString("Instructions?", 50, 300);
	 g.drawString("--press SPACE--", 100, 350);
	 g.drawString("Just want to play?", 50, 600);
	 g.drawString("--press ENTER--", 100, 650);
}

void drawGameState(Graphics g) {
	
	
	g.drawImage(GamePanel.spaceImg, 0, 0, LeagueInvaders.width, LeagueInvaders.height, null);
	
	
g.setColor(Color.green);

fred.draw(g);
	
	
}

void drawEndState(Graphics g) {

	g.setColor(Color.RED);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	
	g.setColor(Color.green);
	g.setFont(titleFont);
	 g.drawString("YOU KILLED " + fred.score + " ENIMIES", 0, 50);
	 g.drawString("--Press 'ENTER'--", 50, 300);
	
}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	
		

		
		
			
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
			
			
			
			speed = -5;
			 //isMoving = true;
			
			}
			
		  if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			 
			speed = 5;
			//isMoving = true;
		 }
		  if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				
				currentState += 1;
				
				if(currentState > END_STATE){

	                currentState = MENU_STATE;

	        }
				
				if (currentState == END_STATE) {
					
					player = new Rocketship(250,700,50,50);
					fred = new ObjectManager(player);
					
				}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
		
			//int cool = makeThemCool.nextInt(10);
			//fred.addLazer(new Lazer(player.x + (20 + cool), player.y , 5, 100));
			fred.addLazer(new Lazer(player.x + (40), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (10), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (20), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (30), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (50), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (60), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (0), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (70), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (80), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (90), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (100), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (110), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (120), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (130), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (140), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (150), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-40), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-10), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-20), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-30), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-50), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-60), player.y - 20, 5, 120));
			fred.addLazer(new Lazer(player.x + (-70), player.y - 20, 5, 120));



			
		}
		


			
		}
		
		
		
	

		
		
		
	
	@Override
	public void keyReleased(KeyEvent e) {
		isMoving = false;
		
	}
	
	
	void purgeEverything(){
		
		if (player.isAlive == false) {
			
			currentState = END_STATE;
			
			player.isAlive = true;
			
		}
		
		
	}
	
}
