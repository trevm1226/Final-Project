import mayflower.*;
public class Runner extends Mayflower{

	public Runner() {
		super("Investment Manager", 600, 800);
		// TODO Auto-generated constructor stub
	}
	public void init(){
		Mayflower.setFullScreen(false);
		World startingWorld = new startScreen();
		Mayflower.setWorld(startingWorld);
		Mayflower.showFPS(true);
	}
	public static void main(String[] args){
		new Runner();
	}
}
