import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;
	GamePanel gamePanel;
	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
		li.setUp();
	}
	public LeagueInvaders(){
		gamePanel = new GamePanel();
		frame = new JFrame();
	}
	void setUp() {
		frame.add(gamePanel);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.addKeyListener(gamePanel);
		gamePanel.startGame();
	}
}