package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

import Chickens.Chicken;
import Chickens.StarterBrownChicken;
import controller.ChickenView;
import model.Game;
import model.Map;

public class ChickenGUI extends JFrame implements Observer{
	private JPanel main = new JPanel();
	private ChickenView display;
	private Game game;
	private Map map;
	private JButton newChickenButton = new JButton();
	private JButton newCoopButton = new JButton();
	private ArrayList<Chicken> chickens;
	
	public static void main(String[] args){
		new ChickenGUI().setVisible(true);
	}
	public ChickenGUI(){
		initGUI();
	}
	
	public void initGUI(){
		setSize(750, 630);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		game = new Game();
		getContentPane().add(main);
		main.setLayout(null);
		display = new ChickenView(game);
		display.setLocation(33, 14);
		main.add(display);
		display.setSize(624,563);
		newChickenButton.setText("New");
		newChickenButton.setBounds(669, 6, 75, 29);
		main.add(newChickenButton);
		
		JButton btnNewCoop = new JButton("New Coop");
		btnNewCoop.setBounds(658, 36, 86, 29);
		main.add(btnNewCoop);
		addObservers();
		registerListeners();
		this.setFocusable(true);
	}
	
	public void registerListeners(){
		display.addMouseListener(new UserClickListener());
		newChickenButton.addActionListener(new ButtonListener());
	}
	
	public void addObservers(){
		game.addObserver(display);
	}
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			game.testingAddChickens(new StarterBrownChicken(null, null));	
		}
		
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
		game = (Game) o;
		chickens = game.getChickens();	
	}
}
