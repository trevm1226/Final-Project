import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mayflower.World;

public class endScreen extends World{

	public endScreen(Long tt)
	{
		setBackground("img/endscreen.jpg");
		restartButton butt = new restartButton();
		addObject(butt, 400, 350);
		totalTimeDisp dis = new totalTimeDisp(tt);
		addObject(dis, 150, 50);
		write(tt);
		//int hss = getHS();
		//highScore hs = new highScore(tt);
		//addObject(hs, 100, 500);
	}
	
	@Override
	public void act() {
		// TODO Auto-generated method stub
		//read total time and display here
	}
	public void write(Long time)
	{
		try(Writer writer = new BufferedWriter(new FileWriter("times.txt", true))) {
			writer.write("\r\n");
			writer.write(time.toString());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getHS()
	{
		String time;
		List<String> timeList = new ArrayList<String>();
		Scanner timeFile = new Scanner("times.txt");
		int small;
		while(timeFile.hasNext())
		{
			time = timeFile.next();
			timeList.add(time);
		}
		small = Integer.parseInt(timeList.get(0));
		while(!timeList.isEmpty())
		{
			int temp = Integer.parseInt(timeList.remove(0));
			if(temp < small)
			{
				small = temp;
			}
		}
		//int[] timeArray = new int[timeList.size()];
		//for(int i = 0; i < timeList.size(); i++)
		//{
		//	timeArray[i] = Integer.parseInt(timeList.get(i));
		//}
		
		return small;
	}

}
