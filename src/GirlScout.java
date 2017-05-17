import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class GirlScout extends InvestmentActor{

	public GirlScout(){
		setImage("img/girlscout.png");
		super.setCost(2);
		super.setValue(1.0);
		super.setTime(2000);
		super.setUpgrades(2.0);
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
