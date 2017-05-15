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
		
		Gbar1 = new loadBar(girlT);
		addObject(girl, 50, 100);
		
		addObject(Gbar1,175,110);
		
		//Donut
		donutT = new Timer();
		donut = new Donut();
		addObject(donut, 50, 175);
		Dbar1 = new loadBar(donutT);
		addObject(Dbar1, 175, 185);
		
		//McDonalds
		mcDT = new Timer();
		mcD = new McDonalds();
		addObject(mcD, 50, 300);
		Mbar1 = new loadBar(mcDT);
		addObject(Mbar1, 175, 310);
		
		//CNN
		fakeTimer = new Timer();
		fakeNews = new CNN();
		addObject(fakeNews, 50, 425);
		Fbar1 = new loadBar(fakeTimer);
		addObject(Fbar1, 175, 435);
		
		//Cowboys
		cowT = new Timer();
		cb = new Cowboys();
		addObject(cb, 50, 525);
		Cbar1 = new loadBar(cowT);
		addObject(Cbar1, 175, 535);
		
		//United
		unitedT = new Timer();
		doctorBeater = new United();
		addObject(doctorBeater, 0, 575);
		Ubar1 = new loadBar(unitedT);
		addObject(Ubar1, 175, 650);
		
		MoneyLabel money = new MoneyLabel(player);
		addObject(money, 50,50);
	}
	@Override
	public void act() {
		
		//Girlscout
		girl.clicked(girlT, player);
		
		//Donut
		donut.clicked(donutT, player);
		
		//McDonalds
		mcD.clicked(mcDT, player);
		
		//CNN
		fakeNews.clicked(fakeTimer, player);
		
		//Cowboys
		cb.clicked(cowT, player);
		
		//United
		doctorBeater.clicked(unitedT, player);
	}
}
