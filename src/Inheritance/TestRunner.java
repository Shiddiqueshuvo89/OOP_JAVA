package Inheritance;

public class TestRunner {

	public static void main(String[] args) {
		
		
		Teacher Teacher1 = new Teacher();
		Teacher1.name= "Shuvo";
		Teacher1.age= 25;
		Teacher1.qualification= "Bsc in CSE";
		
		Teacher Teacher2 = new Teacher();
		Teacher2.name= "Shihab";
		Teacher2.age= 30;
		Teacher2.qualification= "Msc in CSE";
		
		Teacher Teacher3 = new Teacher();
		Teacher3.name= "Shakib";
		Teacher3.age= 32;
		Teacher3.qualification= "Msc in CSE";
		
		
		Teacher1.displayInformation2();
		Teacher2.displayInformation2();
		Teacher3.displayInformation2();
		
		
	}

}
