import mayflower.Actor;
import mayflower.Color;
import mayflower.MayflowerImage;
import mayflower.Timer;
public class investmentTimer extends Actor{

	private InvestmentActor a;
	private Timer t;
		
	public investmentTimer(InvestmentActor act, Timer time)
	{
		a = act;
		t = time;
		MayflowerImage timer = new MayflowerImage("", 24, Color.GREEN);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
		
		if(t.getTimeLeft() > 0) setImage(new MayflowerImage("" + t.getTimeLeft(), 24, Color.GREEN));
		else 
		{
			setImage(new MayflowerImage("" + a.time, 24, Color.GREEN));
		}
	}

}
