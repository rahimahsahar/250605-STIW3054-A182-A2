package assignment2;

public class TotalCoursesSOC extends ReadPdf implements Runnable {
	 
	public void run() {
		
		int i,num=0;
		char ch;
		Thread t4 = new Thread(new TotalCoursesSOC());
		t4.setName("\nThread-4 --->Total number of courses from SOC: ");
		super.run();
		
		for(ch='A';ch<='U';ch++) {
			for(i=1000;i<5000;i++) {
				if(text.contains("STI"+ch+i)) {
					num++;
				}
			}
		}
		
			for(i=1000;i<5000;i++) {
				if(text.contains("STIW"+i)) {
					num++;
				}
			}
		
		
		for(ch='A';ch<='Z';ch++) {
			for(i=1000;i<5000;i++) {
				if(text.contains("STQ"+ch+i)) {
					num++;
					}
				}
			}
		
		try {
			System.out.println(t4.getName()+num);
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	
	}
	
}
