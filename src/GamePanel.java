import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject gameObject;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		gameObject.update();
	}
	public GamePanel() {
		timer = new Timer(1000/60, this);
		gameObject = new GameObject();
	}
	void startGame() {
		timer.start();
	}
	public void paintComponent(Graphics g){
		gameObject.draw(g);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
	