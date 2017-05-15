import mayflower.World;

public class startScreen extends World{

	public startScreen()
	{
		setBackground("img/monoplyGuy.png");
		startButton butt = new startButton();
		addObject(butt, 275, 590);
		title tit = new title();
		addObject(tit, 350,0);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
