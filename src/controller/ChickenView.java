package controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import Chickens.Chicken;
import model.Game;
import model.Map;

public class ChickenView extends JPanel implements Observer{
	private Game game;
	private Map map;
	private ArrayList<Chicken> chickens;
	
	// questionable
	public ChickenView(){
		this.setVisible(true);
	}
	public ChickenView(Game game){
		this.game = game;
	}
	
	public void paintComponent(Graphics g){
		Graphics g2 = (Graphics2D) g;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		game = (Game) o;
		chickens = game.getChickens();
		repaint();
		
		
	}

}
