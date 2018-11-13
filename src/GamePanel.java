import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

  Timer timer;
  GameObjects object;
  final int MENU_STATE = 0;
  final int GAME_STATE = 1;
  final int END_STATE = 2;
  int currentState = MENU_STATE;
  
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
		
		
		
	}

void updateEndState() {
	
	
	
}

void drawMenuState(Graphics g) {
	
	g.setColor(Color.BLUE);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	
}

void drawGameState(Graphics g) {
	
	g.setColor(Color.BLACK);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	
	
}

void drawEndState(Graphics g) {

	g.setColor(Color.RED);

	g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height); 
	

}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			currentState += 1;
			
			if(currentState > END_STATE){

                currentState = MENU_STATE;

        }


			
		}
		
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
