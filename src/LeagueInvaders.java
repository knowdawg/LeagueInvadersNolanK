import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders{

	GamePanel game;
	JFrame frame;
	JPanel panel;
	final static int width = 500;
	final static int height = 800;
	
	public static void main(String[] args) {
		
	
		LeagueInvaders invade = new LeagueInvaders();
		invade.setUp();
		
	}
	
	LeagueInvaders (){
		
		frame = new JFrame();
		game = new GamePanel();
		panel = new JPanel();
		
	}
	
	void setUp(){
		frame.add(game);
		frame.addKeyListener(game);
		
		//panel.add(game);
		
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));

        frame.pack();
        game.startGame();
		
	}
}
