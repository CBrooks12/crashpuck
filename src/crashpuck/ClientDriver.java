package crashpuck;

import java.applet.Applet;
import java.awt.*;

public class ClientDriver extends Applet implements Runnable {
	GUI gui;
	public HomeScreen homescreen;
	
	public ClientDriver(HomeScreen homescreen){
		gui = new GUI();
		this.homescreen = homescreen;
	}
	
	@Override
	public void init() {
		gui.setBackground("assets/background.png");
	}
	
	@Override
	public void start() {
		setBackground(Color.BLACK);
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		System.out.println("running");
		while(true){
			gui.displayOverlay(homescreen);
		}
	}
	@Override
	public void paint(Graphics g) {
		System.out.println("painting");
		gui.displayBackground(g);
		homescreen.displayOverlay(g);
	}
 

}
