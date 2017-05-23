import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class Donut extends InvestmentActor{

	public Donut(){
		setImage("img/donut.png");
		super.setCost(15);
		super.setValue(5.0);
		super.setTime(5000);
		super.setUpgrades(15.0);
	}
	@Override
	public void setCost(int value) {
		super.setCost(value);
	}

	@Override
	public void investmentRate() {
		// TODO Auto-generated method stub
		//FTS
	}

	@Override
	public Double getValue() {
		return super.getValue();
	}

	@Override
	public Double getNextUpgradeCost() {
		return super.getNextUpgradeCost();
	}

	@Override
	public void upgrade() {
		super.upgrade();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	public boolean isClicked(){
		return super.isClicked();
	}

}
