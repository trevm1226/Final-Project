import mayflower.Actor;
import mayflower.Color;
import mayflower.MayflowerImage;
public class totalTimeDisp extends Actor{

	public totalTimeDisp(Long tt)
	{
		MayflowerImage amount = new MayflowerImage("Time taken: " + tt, 24, Color.BLACK);
		setImage(new MayflowerImage("Time taken: " + tt, 24, Color.BLACK));
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
	}

}
