package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import controller.ChickenView;
import model.Game;
import model.Map;

public class ChickenGUI extends JFrame implements Observer{
	private JPanel main = new JPanel();
	private ChickenView display;
	private Game game;
	private Map map;
	
	public static void main(String[] args){
		new ChickenGUI().setVisible(true);
	}
	public ChickenGUI(){
		initGUI();
	}
	
	public void initGUI(){
		setSize(750, 630);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		registerListeners();
	}
	
	public void registerListeners(){
		
	}
	
	private class UserClickListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	

}
