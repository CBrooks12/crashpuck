package crashpuck;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HomeScreen extends Menu{
	Image title;	//name of application "pucks"
	
	public HomeScreen() throws IOException{
		title = ImageIO.read(new File("assets/title.png"));
	}
	
	@Override
	public void displayOverlay(Graphics g) {
		g.drawImage(title, (g.getClipBounds().width/2)-(title.getWidth(null)/2), g.getClipBounds().height/4, null);
	}


}
