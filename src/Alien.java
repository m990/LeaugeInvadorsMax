import java.awt.Color;
import java.awt.Graphics;


public class Alien extends GameObject {
	int speed;
	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;
	}
	void update() {
		super.update();
		y += speed;
		if (y < 0) {
			isAlive = false;
		}
		System.out.println("Updating");
	}
	void draw(Graphics g){
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}
