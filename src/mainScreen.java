import mayflower.*;

public class mainScreen extends World {

	Player player;
	//Girlscout
	Timer girlT;
	InvestmentActor girl;
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
	InvestmentActor donut;
	
	//mcD
	Timer mcDT;
	InvestmentActor mcD;
	
	//CNN
	Timer fakeTimer;
	InvestmentActor fakeNews;
		
	//cowboys
	Timer cowT;
	InvestmentActor cb;
		
	//United
	Timer unitedT;
	InvestmentActor doctorBeater;

	
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
