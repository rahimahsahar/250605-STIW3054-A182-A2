package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class TotalDay extends ReadPdf implements Runnable {
			
	String []data;
	String Date[]=new String [646];
	
	
	public void run() {
		int i,numberOfDays;

		Thread t2 = new Thread(new TotalCoursesSOC());
		t2.setName("\nThread-2 --->Total number of days: ");
		super.run();

		 DateValidator dateValidator = new DateValidator();

		for(i=0;i<text.length();i++) {
			
				if(text.contains(i+".")) {
				
					String info =lines[getLineByLine(i+".")];
					int index= info.indexOf(i+".");
					String t = info.substring(index+9);
					String scrape2 = t.replaceAll("([01][0-9]|2[0-3]):[0-5][0-9]", " ");
					String scrapeDate = scrape2.replaceAll("[^(3[01]|[12][0-9]|[1-9])/(1[012]|[1-9])/[0-9]{4}\\d\\d]+", " ");
					data = scrapeDate.split("\\s+");

					for (String dt:data) {
						
						if (dateValidator.validDate(dt)) {
							
								Date[i]=dt;	
							}
						}
					}
				}
		
			LinkedHashSet<String> uniqueDate = new LinkedHashSet<String>();
			Collections.addAll(uniqueDate, Date);
			List<String>al = new ArrayList<String>(uniqueDate);
			al.remove(null);
			numberOfDays=al.size();
			
			try {
				System.out.println(t2.getName()+numberOfDays);
				Thread.sleep(2000);
			} catch (Exception e) {
				e.getStackTrace();
			}
			

		}

	}
	