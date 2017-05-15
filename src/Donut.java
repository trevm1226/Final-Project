import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class Donut extends Actor implements Investments{

	int cost = 10;
	Double investmentValue = 5.0;
	Queue<Double> upgrades = new LinkedList<Double>();
	
	public Donut(){
		setImage("img/donut.png");
		Double temp = 15.0;
		for(int i = 0; i < 101; i++)
		{
			temp *= 1.1;
			upgrades.add(temp);
		}
	}
	@Override
	public void setCost(int value) {
		// TODO Auto-generated method stub
		cost = value;
	}

	@Override
	public void investmentRate() {
		// TODO Auto-generated method stub
		//fuck this shit
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return investmentValue;
	}

	@Override
	public Double getNextUpgradeCost() {
		// TODO Auto-generated method stub
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
	public void act() {
		// TODO Auto-generated method stub
		
	}
	public boolean isClicked(){
		if(Mayflower.mouseClicked(this))
		{
			return true;
		}
		return false;
	}

}