package crashpuck;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GUI extends JPanel{

	private Image background; 	//store background in the gui for drawing
	private Menu menu;			//menu object that is being displayed
	public GUI(){
		
	}

	/**
	 * Retrieves and stores the background image here from a string
	 * @param bgLoc
	 */
	public void setBackground(String bgLoc){
		try {
			background = ImageIO.read(new File(bgLoc));
			//background = background.getScaledInstance((int)(1200*.7),(int)(900*.7), Image.SCALE_DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * takes abstract menu object and paints the overlay on the screen
	 * @param aMenu
	 */
	public void displayOverlay(Menu aMenu) {
		menu = aMenu;	//store current menu for gui
		repaint();		//repaint screen
	}

	/**
	 * draws the background of the screen
	 * @param graphics
	 */
	public void displayBackground(Graphics g) {
		g.drawImage(background, 0, 0, null);
		
	}

}
