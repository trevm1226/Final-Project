import mayflower.*;
public class MoneyLabel extends Actor{

	private Player player;
	public MoneyLabel(Player p)
	{
		player = p;
		MayflowerImage amount = new MayflowerImage("$", 24, Color.GREEN);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//implement the end of part 7 to improve performance
		setImage(new MayflowerImage("$" + player.getMoney(), 24, Color.GREEN));
	}

}
