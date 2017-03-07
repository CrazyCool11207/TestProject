import java.awt.*;

/**
 * Created by Christian on 07.03.2017.
 */
public class MainController {
	public static void main(String[] args){
	    new MainController();
	}
    
	public MainController() {
		if (Static.DEBUG) {
			Window w = new Window(null) {
				@Override
				public void paint(Graphics g) {
					final Font font = getFont().deriveFont(20);
					g.setFont(font);
					g.setColor(new Color(255, 255, 255, 255));
					final String message = "DEBUG";
					//FontMetrics metrics = g.getFontMetrics(font);
					//System.out.println(metrics.getHeight());
					//System.out.println(metrics.stringWidth(message));
					g.drawString(message, 1, 15);
				}
				
				@Override
				public void update(Graphics g) {
					paint(g);
				}
			};
			w.setAlwaysOnTop(true);
			//w.setBounds(w.getGraphicsConfiguration().getBounds());
			w.setBounds(0, 0, 44, 16);
			w.setBackground(new Color(0, 0, 0, 255));
			w.setVisible(true);
		}
	}
}
