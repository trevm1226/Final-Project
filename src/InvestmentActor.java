import java.util.LinkedList;
import java.util.Queue;

import mayflower.Actor;
import mayflower.Mayflower;
import mayflower.Timer;

public class InvestmentActor extends Actor implements Investments{

	int cost;
	Double investmentValue;
	Queue<Double> upgrades;
	int time;
	public boolean running;
	
	public int getTime()
	{
		return time;
	}
	public void setTime(int t){
		time = t;
	}
	public int getCost()
	{
		return cost;
	}
	@Override
	public void setCost(int value) {
		cost = value;
	}
	public Double getValue() {
		return investmentValue;
	}
	public void setValue(Double t){
		investmentValue = t;
	}
	public Queue<Double> getUpgrades() {
		return upgrades;
	}
	public void setUpgrades(Double start)
	{
		upgrades = new LinkedList<Double>();
		Double temp = start;
		upgrades.add(temp);
		for(int i = 1; i < 101; i++)
		{
			temp *= 1.1;
			upgrades.add(temp);
		}
	}
	
	@Override
	public void investmentRate() {
		//fts
	}	

	@Override
	public Double getNextUpgradeCost() {
		Double ret = (upgrades.peek() * 100.0)/100.0;
		return ret;
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		investmentValue *= 1.5;
		investmentValue = (investmentValue * 100.0)/100.0;
		upgrades.remove();
	}

	@Override
	public boolean isClicked() {
		if(Mayflower.mouseClicked(this))
		{
			return true;
		}
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
	}
	
	
	public void clicked(Timer t, Player p)
	{
			t.set(time);
			running = true;
		
	}

}
