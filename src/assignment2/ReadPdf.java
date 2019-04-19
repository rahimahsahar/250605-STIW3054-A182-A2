package assignment2;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class ReadPdf implements Runnable {
	
	 protected static String text;
	 protected static String [] lines;
	
	public void run() {
		 try { 
			
			 PDDocument document = PDDocument.load(new File("A182 Draft Student.pdf"));
			 document.getClass();
			 if (!document.isEncrypted()) {
				 PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				 stripper.setSortByPosition(true);
				 PDFTextStripper textStripper = new PDFTextStripper();
				 text = textStripper.getText(document);
				 lines = text.split(System.getProperty("line.seperator"));
				 
			document.close();
			 }
		 }  catch(IOException ie){
		 	
			 
         ie.printStackTrace();
		 }
	}

	static int getLineByLine(String filter) {
	    int a = 0;
	    for(String eLine : lines) {
	        if(eLine.indexOf(filter) >=0) {
	            return a;
	        }
	        a++;
	    }
	    return 0;
	}
	static String getLine(int a) {
		
			return lines[a];
		}
	
}
	
