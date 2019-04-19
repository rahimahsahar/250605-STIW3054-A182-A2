package assignment2;

public class App extends ReadPdf {

	
	public static void main(String[] args) throws Exception {
		
	
		TotalNoCourses NC = new TotalNoCourses();
		TotalDay ND = new TotalDay();
		TotalNoCourses CS = new TotalNoCourses();
		TotalCoursesSOC NCS = new TotalCoursesSOC();
		STIW3054 IS = new STIW3054();
		
		
	
		Thread t1 = new Thread(NC);
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread(ND);
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t4 = new Thread (NCS);
		t4.start();
		try {
			t4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t3 = new Thread (CS);
		t3.start();
		try {
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

		Thread t5 = new Thread (IS);
		t5.start();
		try {
			t5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}