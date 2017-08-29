import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {
	int speed;
	public Projectile(int x, int y, int width, int height){
		super(x, y, width, height);
		/*x = 270;
		y = 200;
		width = 50;
		height = 50;*/
		speed = 10;
	}
	void update() {
		y -= speed;
		if (y < 0) {
			isAlive = false;
		}
		System.out.println("Updating");
	}
	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
		//System.out.println(y);

	}
}
