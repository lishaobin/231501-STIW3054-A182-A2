package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Display extends Thread{
	String[] list;
	public Display(String[] list) {
		this.list=list;
		// TODO Auto-generated constructor stub
	}
	public synchronized void run() {
		 System.out.println("\n\t\tThe information of STIW3054\n");
		for(String line : list) {
			 Pattern p1 = Pattern.compile("STIW3054");
			 Matcher m1=p1.matcher(line);  
			 if (m1.find())
				 System.out.println(line);
		}
	}
}
