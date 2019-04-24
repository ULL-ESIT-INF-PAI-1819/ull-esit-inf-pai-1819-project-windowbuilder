import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

class Circulo extends JPanel {
	private int x;
	private int y;
	private int size = 75;
	private int desplazamiento;
	private int col;
	
	public Circulo() {
		this.x = 215;
		this.y = 75;
		this.desplazamiento = 10;
		col = 0;
	}
	
	public Circulo (int x, int y) {
		this.x = x;
		this.y = y;
		this.desplazamiento = 1;
		col = 0;
	}
	
	public Circulo (int d) {
		this.x = getWidth()/2;
		this.y = getHeight()/2;
		this.desplazamiento = d;
		col = 0;
	}
	
	public Circulo (int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.desplazamiento = d;
		col = 0;
	}

	public boolean MoveUpLegal() {
		if(this.y-this.desplazamiento >= this.size/2)
			return true;
		else
			return false;
	}

	public boolean MoveRightLegal() {
		if(this.x+this.desplazamiento <= getWidth()-this.size/2)
			return true;
		else
			return false;
	}

	public boolean MoveLeftLegal() {
		if(this.x-this.desplazamiento>=this.size/2)
			return true;
		else
			return false;
	}

	public boolean MoveDownLegal() {
		if(this.y+this.desplazamiento <= getHeight()-this.size/2)
			return true;
		else
			return false;
	}
	
	public void MoveUp() {
		if(MoveUpLegal()) {
			this.y = this.y-this.desplazamiento;
			repaint();
		}else {
			this.y = getHeight()-size/2;
			Random aleatorio = new Random(System.currentTimeMillis());
			col = aleatorio.nextInt(5);
			repaint();
		}
	}
	
	public void MoveRight() {
		if(MoveRightLegal()) {
			this.x = this.x+this.desplazamiento;
			repaint();
		}else {
			this.x = size/2;
			Random aleatorio = new Random(System.currentTimeMillis());
			col = aleatorio.nextInt(5);
			repaint();
		} 
	}
	
	public void MoveLeft() {
		if(MoveLeftLegal()) {
			this.x = this.x-this.desplazamiento;
			repaint();
		}else {
			this.x = getWidth()-size/2;
			Random aleatorio = new Random(System.currentTimeMillis());
			col = aleatorio.nextInt(5);
			repaint();
		}
	}
	
	public void MoveDown() {
		if(MoveDownLegal()) {
			this.y = this.y+this.desplazamiento;
			repaint();
		}else {
			this.y = size/2;
			repaint();
			Random aleatorio = new Random(System.currentTimeMillis());
			col = aleatorio.nextInt(5);
			repaint();
		}
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.cyan);
		switch(col) {
		case 0: 
			g.setColor(Color.red);
			break;
		case 1: 
			g.setColor(Color.black);
			break;
		case 2: 
			g.setColor(Color.blue);
			break;
		case 3: 
			g.setColor(Color.yellow);
			break;
		case 4: 
			g.setColor(Color.green);
			break;
		case 5: 
			g.setColor(Color.orange);
			break;
		}
		g.fillOval(this.x - this.size/2, this.y - this.size/2, this.size, this.size);
	}
}
