package assignment2;

public class ListCourses extends ReadPdf implements Runnable {
	
	 int a=0;
	 
	 
	public void run() {
		
		int i;
		char ch;
		Thread t3 = new Thread(new ListCourses());
		t3.setName("\nThread-3 --->List of courses from SOC: ");
		super.run();
		
		try {
			System.out.println(t3.getName());
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
		for(ch='A';ch<='U';ch++) {
		for(i=1000;i<5000;i++) {
			if(text.contains("STI"+ch+i)) {
				String info =lines[getLineByLine("STI"+ch+i)];
				int index= info.indexOf("STI"+ch+i);
				String t = info.substring(index);
				String scrape = t.replaceAll("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", " ");
				String scrape2 = scrape.replaceAll("([01]?[0-9]|2[0-3]):[0-5][0-9]", " ");
				a++;
					try {
						System.out.println("\n "+a+". "+ scrape2);
						Thread.sleep(2000);
					} catch (Exception e) {
						e.getStackTrace();
					}	
				}
			}
		}
		
	
			for(i=1000;i<5000;i++) {
				if(text.contains("STIW"+i)) {
					String info =lines[getLineByLine("STIW"+i)];
					int index= info.indexOf("STIW"+i);
					String t = info.substring(index);
					String scrape = t.replaceAll("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", " ");
					String scrape2 = scrape.replaceAll("([01]?[0-9]|2[0-3]):[0-5][0-9]", " ");
					a++;
						try {
							System.out.println("\n "+a+". "+ scrape2);
							Thread.sleep(2000);
						} catch (Exception e) {
							e.getStackTrace();
						}
	
					}
				}
			

		for(ch='A';ch<='Z';ch++) {
			for(i=1000;i<5000;i++) {
				if(text.contains("STQ"+ch+i)) {
					String info2 =lines[getLineByLine("STQ"+ch+i)];
					int index= info2.indexOf("STQ"+ch+i);
					String t = info2.substring(index);
					String scrape = t.replaceAll("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)", " ");
					String scrape2 = scrape.replaceAll("([01]?[0-9]|2[0-3]):[0-5][0-9]", " ");
					a++;
					try {
						System.out.println("\n "+a+". "+ scrape2);
						Thread.sleep(2000);
					} catch (Exception e) {
						e.getStackTrace();
					}
						

				}
			}
		}
	}
}
