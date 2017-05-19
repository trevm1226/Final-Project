import mayflower.World;

public class endScreen extends World{

	public endScreen(Long tt)
	{
		setBackground("img/endscreen.jpg");
		restartButton butt = new restartButton();
		addObject(butt, 300, 400);
		totalTimeDisp dis = new totalTimeDisp(tt);
		addObject(dis, 100, 400);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//read total time and dsplay here
	}

}
