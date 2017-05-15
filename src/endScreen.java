import mayflower.World;

public class endScreen extends World{

	public endScreen()
	{
		restartButton butt = new restartButton();
		addObject(butt, 300, 400);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
