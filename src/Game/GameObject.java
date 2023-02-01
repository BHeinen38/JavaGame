package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	
	protected int x, y;
	
	protected ID id;
	protected int VelX, VelY;
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
		
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	
	public void setX(int x) {
		this.x = x;
		
	}
	public void setY(int y) {
		this.y = y;
		
	}
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;
		
	}
	public void setId(ID id) {
		this.id = id;
		
	}
	public ID getId() {
		return id;
		
	}
	public void setVelX(int velX) {
		this.VelX = velX;
		
	}
	public void setVelY(int velY) {
		this.VelY = velY;
		
	}
	public int getVelX() {
		return VelX;
	}
	public int getVelY() {
		return VelY;
		
	}
		
	

}
