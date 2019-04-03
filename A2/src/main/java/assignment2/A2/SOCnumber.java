package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SOCnumber extends Thread{
	String[] list;
	
	public SOCnumber(String[] list) {
		this.list=list;
		// TODO Auto-generated constructor stub
	}
	public synchronized void run() {
		int count=0;
		for(String line : list) {
		 Pattern p1 = Pattern.compile("[A-Z]+\\d+");
		 Pattern p2 = Pattern.compile("ST");
		 Pattern p3 = Pattern.compile("STIV");
		 Matcher m1=p1.matcher(line);  
		 while (m1.find()) {
			 Matcher m2=p2.matcher(m1.group());  
			while (m2.find()) {
				Matcher m3=p3.matcher(line);
				if (!m3.find())
		        count++;
		        }
		 }
		}
		System.out.println("The number of courses from SOC : "+count);
	}

}
