package src;

/**
 * Created by MissingNo on 06.03.2017.
 */
public abstract class Screen {
	protected boolean running = true;
	
	protected abstract void update();
	protected abstract void show();
	protected abstract void init();
	
	public void run(){
		if(running) {
			update();
		}
		show();
		
		
	}
}
