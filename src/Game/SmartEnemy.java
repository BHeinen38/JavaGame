package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy extends GameObject {
	private Handler handler;
	private GameObject player;

	public SmartEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		// TODO Auto-generated constructor stub
		this.handler = handler;
		for(int i =0; i < handler.object.size(); i++) {
			if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
		}
		
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);

	}

	public void tick() {
		x += VelX;
		y += VelY;
		
		float diffX = x - player.getX() - 8;
		float diffY = y - player.getY() - 8;
		float distance = (float) Math.sqrt((x-player.getVelX())*(x-player.getX())+ (y-player.getY())*(y-player.getY()));
		
		VelX = (int) ((-1.0/distance) * diffX);
		VelY = (int) ((-1.0/distance) * diffY);

		if (y <= 0 || y >= Game.HEIGHT - 32)
			VelY *= -1;

		if (x <= 0 || x >= Game.WIDTH - 16)
			VelX *= -1;

		handler.addObject(new Trail(x, y, ID.Trail, Color.green, 16, 16, 0.02f, handler));

	}

	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 16, 16);

	}

}

