import mayflower.Actor;
import mayflower.Mayflower;
public class restartButton extends Actor{

	public restartButton()
	{
		setImage("img/RESET.png");
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(Mayflower.mouseClicked(this))
		{
			Mayflower.setWorld(new startScreen());
		}
	}

}
