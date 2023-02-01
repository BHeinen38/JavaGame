package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy extends GameObject {
	private Handler handler;

	public FastEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		this.handler = handler;
		VelX = 2;
		VelY = 9;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);

	}

	public void tick() {
		x += VelX;
		y += VelY;

		if (y <= 0 || y >= Game.HEIGHT - 32)
			VelY *= -1;

		if (x <= 0 || x >= Game.WIDTH - 16)
			VelX *= -1;

		handler.addObject(new Trail(x, y, ID.Trail, Color.CYAN, 16, 16, 0.02f, handler));

	}

	public void render(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, 16, 16);

	}

}

