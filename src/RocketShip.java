import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject {
	int speed;
	public RocketShip() {
		x = 270;
		y = 200;
		width = 50;
		height = 50;
		speed = 5;
	}
	void update() {
		
	}
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);

	}
}
