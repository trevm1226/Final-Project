import mayflower.*;

public class mainScreen extends World {

	Player player;
	//Girlscout
	Timer girlT;
	InvestmentActor girl;
	loadBar Gbar1;
	
	
	//donut
	Timer donutT;
	InvestmentActor donut;
	loadBar Dbar1;
	//mcD
	Timer mcDT;
	InvestmentActor mcD;
	loadBar Mbar1;
	//CNN
	Timer fakeTimer;
	InvestmentActor fakeNews;
	loadBar Fbar1;	
	//cowboys
	Timer cowT;
	InvestmentActor cb;
	loadBar Cbar1;
	//United
	Timer unitedT;
	InvestmentActor doctorBeater;
	loadBar Ubar1;
	
	public mainScreen(){
		player = new Player();
		setBackground("img/background.jpg");
		
		//Girlscout
		girlT = new Timer();
		girl = new GirlScout();
		
		Gbar1 = new loadBar(girlT, girl.getTime());
		addObject(girl, 50, 100);
		
		addObject(Gbar1,175,110);
		
		//Donut
		donutT = new Timer();
		donut = new Donut();
		addObject(donut, 50, 175);
		Dbar1 = new loadBar(donutT, donut.getTime());
		addObject(Dbar1, 175, 185);
		
		//McDonalds
		mcDT = new Timer();
		mcD = new McDonalds();
		addObject(mcD, 50, 300);
		Mbar1 = new loadBar(mcDT, mcD.getTime());
		addObject(Mbar1, 175, 310);
		
		//CNN
		fakeTimer = new Timer();
		fakeNews = new CNN();
		addObject(fakeNews, 50, 425);
		Fbar1 = new loadBar(fakeTimer, fakeNews.getTime());
		addObject(Fbar1, 175, 435);
		
		//Cowboys
		cowT = new Timer();
		cb = new Cowboys();
		addObject(cb, 50, 525);
		Cbar1 = new loadBar(cowT, cb.getTime());
		addObject(Cbar1, 175, 535);
		
		//United
		unitedT = new Timer();
		doctorBeater = new United();
		addObject(doctorBeater, 0, 575);
		Ubar1 = new loadBar(unitedT, doctorBeater.getTime());
		addObject(Ubar1, 175, 650);
		
		MoneyLabel money = new MoneyLabel(player);
		addObject(money, 50,50);
	}
	@Override
	public void act() {
		
		//Girlscout
		if (girl.isClicked()){
			girl.clicked(girlT, player);
			Gbar1.act();
		}
			
	

		if(girlT.isDone() && girl.running == true)
		{
			girl.running = false;
			player.moreMoney(girl.getValue());
			Gbar1.i = 1;
			Gbar1.target = new Long(Gbar1.init - (Gbar1.init/10));
		}
		
		//Donut
		if (donut.isClicked()) donut.clicked(donutT, player);
		if(donutT.isDone() && donut.running == true)
		{
			donut.running = false;
			player.moreMoney(donut.getValue());
		}
		
		//McDonalds
		if (mcD.isClicked()) mcD.clicked(mcDT, player);
		if(mcDT.isDone() && mcD.running == true)
		{
			mcD.running = false;
			player.moreMoney(mcD.getValue());
		}
		
		//CNN
		if (fakeNews.isClicked()) fakeNews.clicked(fakeTimer, player);
		if(fakeTimer.isDone() && fakeNews.running == true)
		{
			fakeNews.running = false;
			player.moreMoney(fakeNews.getValue());
		}
		
		//Cowboys
		if (cb.isClicked()) cb.clicked(cowT, player);
		if(cowT.isDone() && cb.running == true)
		{
			cb.running = false;
			player.moreMoney(cb.getValue());
		}
		
		//United
		if (doctorBeater.isClicked()) doctorBeater.clicked(unitedT, player);
		if(unitedT.isDone() && doctorBeater.running == true)
		{
			doctorBeater.running = false;
			player.moreMoney(doctorBeater.getValue());
		}
	}
}
