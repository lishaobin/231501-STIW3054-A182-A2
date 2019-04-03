package assignment2.A2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class totalcourses extends Thread{
	String[] list;
	public totalcourses(String[] list) {
		this.list=list;
	}
		// TODO Auto-generated constructor stub
	@Override
	public synchronized void run() {
		 String t = null;
		 for(String line : list) {
			
		 Pattern p = Pattern.compile("^\\d+");
		 Matcher m=p.matcher(line); 
		 while(m.find()) { 
		 t=m.group();
		 
		 }
		 }
		 System.out.println("The Total number of courses : "+t);

		// TODO Auto-generated method stub
		
	}
	

	



}
