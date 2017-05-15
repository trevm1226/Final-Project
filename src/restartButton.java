import mayflower.Actor;
import mayflower.Mayflower;
public class restartButton extends Actor{

	public restartButton()
	{
		setImage("img/restartbutton.jpg");
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
