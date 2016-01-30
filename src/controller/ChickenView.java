package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Chickens.Chicken;
import coops.Coop;
import model.Game;
import model.Map;

public class ChickenView extends JPanel implements Observer{
	private Game game;
	private Map map;
	private ArrayList<Chicken> chickens;
	private ArrayList<Coop> coops;
	private Image brownChicken, whiteChicken, coop;
	private Chicken selectedChicken;
	
	// questionable
	public ChickenView(){
		this.setVisible(true);
	}
	public ChickenView(Game game){
		this.game = game;
		try {
			brownChicken = ImageIO.read(new File("./images/brown_chicken.png"));
			whiteChicken = ImageIO.read(new File("./images/white_chicken.png"));
			coop = ImageIO.read(new File("./images/house.png"));
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public ArrayList<Chicken> getChickens(){
		return chickens;
	}
	
	public void selectChicken(Point p){
		for (Chicken c:chickens){
			if (c.getLocation().x == p.x/50 && c.getLocation().y == p.y/50){
				selectedChicken = c;
				System.out.println(selectedChicken);
			}
		}
	}
	
	public Chicken getSelectedChicken(){
		return selectedChicken;
	}
	
	public void paintComponent(Graphics g){
		Graphics g2 = (Graphics2D) g;
		for (Chicken c: game.getChickens()){
			if (c.getGenetics().getColor().equals("Brown")){
				g2.drawImage(brownChicken, c.getLocation().x *50, c.getLocation().y*50, null);
			}
			else {
				g2.drawImage(whiteChicken, c.getLocation().x *50, c.getLocation().y*50, null);
			}
		}
		for (Coop house: game.getCoop()){
			g2.drawImage(coop, house.getLocation().x *50, house.getLocation().y*50, null);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		game = (Game) o;
		chickens = game.getChickens();
		coops = game.getCoop();
		repaint();	
	}

}
