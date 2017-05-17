import mayflower.*;
public class loadBar extends Actor{

	Timer time;
	int init;
	Long target;
	int i;
	public loadBar(Timer t, int inittime)
	{
		time = t;
		setImage("img/progressbarblue0.png");
		init = inittime;
		target = new Long(init - (init/10));
		i = 1;
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
		if(time.getTimeLeft() == (target)){
			System.out.println(time.getTimeLeft());
			setImage("img/progressbarblue" + i + ".png");
			i++;
			target -= 200;
		}
	}
	

}