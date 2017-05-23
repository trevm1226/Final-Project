import mayflower.*;

public class mainScreen extends World {
	public Long endTime;
	public Long totalTime;
	Player player;
	//Girlscout
	Timer girlT;
	InvestmentActor girl;
	loadBar Gbar1;
	upgradeButton ubg;
	investmentTimer girlit;
	
	//donut
	Timer donutT;
	InvestmentActor donut;
	loadBar Dbar1;
	upgradeButton ubd;
	investmentTimer doLit;
	//mcD
	Timer mcDT;
	InvestmentActor mcD;
	loadBar Mbar1;
	upgradeButton ubm;
	investmentTimer mcLit;
	//CNN
	Timer fakeTimer;
	InvestmentActor fakeNews;
	loadBar Fbar1;
	upgradeButton ubf;
	investmentTimer fakeLit;
	//cowboys
	Timer cowT;
	InvestmentActor cb;
	loadBar Cbar1;
	upgradeButton ubc;
	investmentTimer cowLit;
	//United
	Timer unitedT;
	InvestmentActor doctorBeater;
	loadBar Ubar1;
	upgradeButton ubu;
	investmentTimer unLit;
	
	public mainScreen(){
		player = new Player();
		setBackground("img/background.jpg");
		
		//Girlscout
		girlT = new Timer();
		girl = new GirlScout();
		Gbar1 = new loadBar(girlT, girl.getTime());
		ubg = new upgradeButton(girl, player);
		girlit = new investmentTimer(girl, girlT);
		

		addObject(girl, 50, 100);
		addObject(Gbar1,175,110);
		addObject(ubg, 50, 160);
		addObject(girlit, 200, 110);

		
		//Donut
		donutT = new Timer();
		donut = new Donut();
		ubd = new upgradeButton(donut, player);
		
		addObject(donut, 50, 210);
		Dbar1 = new loadBar(donutT, donut.getTime());
		addObject(Dbar1, 175, 240);
		addObject(ubd, 50, 305);
		doLit = new investmentTimer(donut, donutT);
		addObject(doLit, 200, 240);
		//McDonalds
		mcDT = new Timer();
		mcD = new McDonalds();
		ubm = new upgradeButton(mcD, player);
		addObject(mcD, 50, 350);
		Mbar1 = new loadBar(mcDT, mcD.getTime());
		addObject(Mbar1, 175, 380);
		addObject(ubm, 50, 430);
		mcLit = new investmentTimer(mcD, mcDT);
		addObject(mcLit, 200, 380);
		//CNN
		fakeTimer = new Timer();
		fakeNews = new CNN();
		ubf = new upgradeButton(fakeNews, player);
		addObject(fakeNews, 50, 485);
		Fbar1 = new loadBar(fakeTimer, fakeNews.getTime());
		addObject(Fbar1, 175, 485);
		addObject(ubf, 50, 530);
		fakeLit = new investmentTimer(fakeNews, fakeTimer);
		addObject(fakeLit, 200, 485);
		//Cowboys
		cowT = new Timer();
		cb = new Cowboys();
		ubc = new upgradeButton(cb, player);
		addObject(cb, 50, 570);
		Cbar1 = new loadBar(cowT, cb.getTime());
		addObject(Cbar1, 175, 585);
		addObject(ubc, 50, 620);
		cowLit = new investmentTimer(cb, cowT);
		addObject(cowLit, 200, 585);
		
		//United
		unitedT = new Timer();
		doctorBeater = new United();
		ubu = new upgradeButton(doctorBeater, player);
		addObject(doctorBeater, 0, 600);
		Ubar1 = new loadBar(unitedT, doctorBeater.getTime());
		addObject(Ubar1, 175, 690);
		addObject(ubu, 50, 740);
		unLit = new investmentTimer(doctorBeater, unitedT);
		addObject(unLit, 200, 690);
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
		if(player.getMoney() >= 10.0)
		{
			
			endTime = System.currentTimeMillis();
			totalTime = endTime - player.getStart();
			Mayflower.setWorld(new endScreen(totalTime));
			//write to file here
		}
	}
}
