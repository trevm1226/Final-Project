import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class United extends InvestmentActor{

	public United(){
		setImage("img/United.png");
		super.setCost(1000);
		super.setValue(666.6);
		super.setTime(15000);
		super.setUpgrades(1500.0);
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
