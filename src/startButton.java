import mayflower.*;
public class startButton extends Actor{

	public startButton()
	{
		setImage("img/newStart.png");
		
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(Mayflower.mouseClicked(this))
		{
			Mayflower.setWorld(new mainScreen());
		}
	}

}
