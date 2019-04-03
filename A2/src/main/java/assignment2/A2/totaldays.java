package assignment2.A2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class totaldays extends Thread {
	String[] list;
	public totaldays(String[] list) {
		this.list=list;
		
		
		// TODO Auto-generated constructor stub
	}
	public synchronized void run() {
		 int  x=0,month=0,maxdate=0,max=0,mindate=31,min=0,total;
		for(String line : list) {
			 Pattern p1 = Pattern.compile("\\d+\\/+\\d+\\/+\\d+");
			 Pattern p2 = Pattern.compile("\\/+\\d+\\/");
			 Pattern p3 = Pattern.compile("\\d+");
			 Pattern p4 = Pattern.compile("\\d+\\/");
			 Pattern p5 = Pattern.compile("^\\d+\\/");
			 Matcher m1=p1.matcher(line);  
			 while(m1.find()) {
				 Matcher m2=p2.matcher(m1.group());  
			     while (m2.find()) {
			    	 Matcher m3=p3.matcher(m2.group()); 
			    	 while (m3.find()) {
			    	 month=Integer.parseInt(m3.group());
			    	 
			    	 if (month>x) 
							x=month; 
						 
			    	 
			    	 if (month==6) {
			    		 Matcher m4=p4.matcher(line);  
			    		 while(m4.find()) {
			    			 Matcher m5=p3.matcher(m4.group());	
			    			 while(m5.find())
			    			 max=Integer.parseInt(m5.group());
			    			  if (max>maxdate)
			    				  maxdate=max;
			    			
			    		 }	    		 
			    	 }
			    	 
			    	 else {
			    		 Matcher m4=p5.matcher(line);  
			    		 while(m4.find()) {
			    			 Matcher m5=p3.matcher(m4.group());	
			    			 while(m5.find())
			    			 min=Integer.parseInt(m5.group());
			    			  if (min<mindate)
			    				  mindate=min;
			    			 
			    		 }	    		 
			    	 }
			    	 }
						 
					 }		 
			     }
			 }
		 
	 total=(24-mindate)+maxdate;
	 System.out.println("The Total number of days : "+total);
		
	}
		
  
}

