import mayflower.Actor;
import mayflower.Mayflower;
public class upgradeButton extends Actor{

	private InvestmentActor act;
	private Player p;
	
	public upgradeButton(InvestmentActor a, Player play)
	{
		p = play;
		act = a;
		setImage("img/upgrade.png");
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(Mayflower.mouseClicked(this) && upgradeOK())
		{
			p.moreMoney(-1 * act.getNextUpgradeCost());
			act.upgrade();
			
		}
	}
	public boolean upgradeOK()
	{
		if(p.getMoney() >= act.getNextUpgradeCost()) return true;
		return false;
	}

}