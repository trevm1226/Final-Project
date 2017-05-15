import mayflower.*;
public class loadBar extends Actor{

	Timer time;
	public loadBar(Timer t)
	{
		time = t;
		setImage("img/progressbarblue0.png");
		
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
		//Long timeLeft = time.getTimeLeft();
		//Long target = timeLeft - (timeLeft / 10);
		//int i = 1;
		//if(timeLeft == target){
			//setImage("img/progressbarblue" + i + ".png");
			//i++;
			//target /= 10;
		//}
	}

}