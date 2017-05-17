import mayflower.*;
import java.util.LinkedList;
import java.util.Queue;

public class Cowboys extends InvestmentActor{
	
	public Cowboys(){
		setImage("img/dallas-cowboys.png");
		super.setCost(15000);
		super.setValue(8000.0);
		super.setTime(20000);
		super.setUpgrades(15000.0);
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
