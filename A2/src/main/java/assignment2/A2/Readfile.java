package assignment2.A2;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

/**
 * Hello world!
 *
 */
public class Readfile 
{
    public static void main( String[] args ) throws InterruptedException
    {
try (PDDocument document = PDDocument.load(new File("D:A182 Draft Stud.PDF"))) {
			
			document.getClass();
			
			if(!document.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper tStripper = new PDFTextStripper();
				
				String pdfFileInText = tStripper.getText(document);
				
				String[] list = pdfFileInText.split("\\r?\\n");
			
			 totalcourses t1 =new totalcourses(list); 
		     totaldays t2 =new  totaldays(list);   
		     SOCcourse t3 =new SOCcourse(list);	    
		     SOCnumber t4 =new SOCnumber(list);	    
		     Display t5 = new Display(list);
		     t1.start();
		     Thread.sleep(2000);
		     t2.start();
		     Thread.sleep(2000);
		     t4.start();
		     t4.join();
		     Thread.sleep(2000);
		     t3.start();
		     Thread.sleep(2000);
		     t5.start();
		     Thread.sleep(2000);
			}	
			
		} catch (InvalidPasswordException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 


    }
}
