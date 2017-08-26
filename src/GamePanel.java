import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font buttonFont;
	Font startOver;
	RocketShip rocketShip = new RocketShip();
	
	void updateMenuState() {
		
	}
	void updateGameState() {
	}
	void updateEndState() {
		
	}
	
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont); 
		g.setColor(Color.GREEN);
		g.drawString("Leauge Invadors", 75, 175);
		g.setFont(buttonFont);
		g.setColor(Color.GREEN.brighter());
		g.drawString("Press Enter to start", 50, 300);
	}
	void drawGameState(Graphics g) {
		rocketShip.draw(g);
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont); 
		g.setColor(Color.GREEN);
		g.drawString("Game over", 75, 175);
		g.setFont(startOver);
		g.drawString("Press enter to play again", 10, 300);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.paintImmediately(getBounds());
		if (currentState == MENU_STATE) {
			updateMenuState();
		}
		else if (currentState == GAME_STATE) {
			updateGameState();
		}
		else if (currentState == END_STATE) {
			updateEndState();
		}
	}
	
	// Constructor
	public GamePanel() {
		timer = new Timer(1000/60, this);
		titleFont = new Font("Arial", Font.BOLD, 45);
		buttonFont = new Font("Arial", Font.PLAIN, 48);
		startOver = new Font("Arial", Font.PLAIN, 40);
	}
	
	
	void startGame() {
		timer.start();
	}
	public void paintComponent(Graphics g){
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		}
		else if (currentState == GAME_STATE) {
			drawGameState(g);
		}
		else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Left pressed");
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Right pressed");
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(currentState == END_STATE){
				currentState = MENU_STATE;
			}
			else if(currentState == MENU_STATE) {
				currentState = GAME_STATE;
			}
			else if(currentState == GAME_STATE) {
				currentState = END_STATE;
			}

		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
