import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class McDonalds extends InvestmentActor{

	public McDonalds(){
		setImage("img/mcD.png");
		super.setCost(150);
		super.setValue(75.0);
		super.setTime(10000);
		super.setUpgrades(150.0);
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
