import mayflower.*;

public class mainScreen extends World {

	Player player;
	//Girlscout
	Timer girlT;
	GirlScout girl;
	bar Gbar1;
	bar Gbar2;
	bar Gbar3;
	bar Gbar4;
	bar Gbar5;
	bar Gbar6;
	bar Gbar7;
	bar Gbar8; 
	bar Gbar9;
	bar Gbar10; 
	
	//donut
	Timer donutT;
	Donut donut;
	
	//mcD
	Timer mcDT;
	McDonalds mcD;
	
	//CNN
	Timer fakeTimer;
	CNN fakeNews;
		
	//cowboys
	Timer cowT;
	Cowboys cb;
		
	//United
	Timer unitedT;
	United doctorBeater;

	
	public mainScreen(){
		player = new Player();
		setBackground("img/background.jpg");
		
		//Girlscout
		girlT = new Timer();
		girl = new GirlScout();
		Gbar1 = new bar(); 
		//loadBar loadBar1 = new loadBar();
		addObject(girl, 50, 100);
		addObject(Gbar1, 175, 110);
		//addObject(loadBar1,175,110);
		
		//Donut
		donutT = new Timer();
		donut = new Donut();
		addObject(donut, 50, 175);
		
		//McDonalds
		mcDT = new Timer();
		mcD = new McDonalds();
		addObject(mcD, 50, 300);
		
		//CNN
		fakeTimer = new Timer();
		fakeNews = new CNN();
		addObject(fakeNews, 50, 425);
		
		//Cowboys
		cowT = new Timer();
		cb = new Cowboys();
		addObject(cb, 50, 525);
		
		//United
		unitedT = new Timer();
		doctorBeater = new United();
		addObject(doctorBeater, 15, 575);
		
		MoneyLabel money = new MoneyLabel(player);
		addObject(money, 50,50);
	}
	@Override
	public void act() {
		
		//Girlscout
		boolean boolg = false;
		if(girl.isClicked()){
			girlT.set(2000);
			boolg = true;
		}
		if(girlT.isDone() && boolg == true)
		{
			boolg = false;
			player.moreMoney(girl.getValue());
		}
		
		//Donut
		boolean boold = false;
		if(donut.isClicked()){
			donutT.set(5000);
			boold = true;
		}
		if(donutT.isDone() && boold == true)
		{
			boold = false;
			player.moreMoney(donut.getValue());
		}
		
		//McDonalds
		boolean boolm = false;
		if(mcD.isClicked()){
			mcDT.set(7500);
			boolm = true;
		}
		if(mcDT.isDone() && boolm == true)
		{
			boolm = false;
			player.moreMoney(mcD.getValue());
		}
		
		//CNN
		boolean boolc = false;
		if(fakeNews.isClicked()){
			fakeTimer.set(10000);
			boolc = true;
		}
		if(fakeTimer.isDone() && boolc == true)
		{
			boolc = false;
			player.moreMoney(fakeNews.getValue());
		}
		
		//Cowboys
		boolean boolb = false;
		if(cb.isClicked()){
			cowT.set(15000);
			boolb = true;
		}
		if(cowT.isDone() && boolb == true)
		{
			boolb = false;
			player.moreMoney(cb.getValue());
		}
		
		//United
		boolean boolu = false;
		if( doctorBeater.isClicked()){
			unitedT.set(30000);
			boolu = true;
		}
		if(unitedT.isDone() && boolu == true)
		{
			boolu = false;
			player.moreMoney(doctorBeater.getValue());
		}
	}
}
