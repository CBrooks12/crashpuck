package crashpuck;

import java.applet.Applet;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

public class Client{
	public Client() throws IOException{
		final Applet applet = new ClientDriver(new HomeScreen());
		JFrame frame = new JFrame();
		frame.setSize(532,850);
		frame.setResizable(false);
		frame.getContentPane().add(applet);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				applet.stop();
		    	applet.destroy();
		    	System.exit(0);
		    }
		});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applet.init();
		applet.start();
	}

}
