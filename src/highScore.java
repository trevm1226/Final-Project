import mayflower.Actor;
import mayflower.Color;
import mayflower.MayflowerImage;
public class highScore extends Actor{

	public highScore(int hss)
	{
		MayflowerImage amount = new MayflowerImage("High Score: " + hss + " seconds", 24, Color.BLACK);
		setImage(new MayflowerImage("High Score: " + hss + " seconds", 24, Color.BLACK));
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
	}

}
