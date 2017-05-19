import mayflower.*;
public class Player extends Actor{

	private Long start;
	private Double money;
	public Player()
	{
		setStart(System.currentTimeMillis());
		money = 0.0;
	}
	public Double getMoney()
	{
		return money;
	}
	public void moreMoney(Double amount)
	{
		money += (amount* 100.0)/100.0;
	}
	public Long getStart() {
		return start;
	}
	public void setStart(Long start) {
		this.start = start;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
