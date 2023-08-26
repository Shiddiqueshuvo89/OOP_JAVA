package Polymorphism;

public class Test {

	public static void main(String[] args) {

		Person Person1 = new Person();
		Person1.name = "Shuvo";
		Person1.age = 25;
		Person1.qualification = "Bsc in CSE";
		Person1.displayInformation();

		Teacher Teacher1 = new Teacher();
		Teacher1.name = "Shovon Lal";
		Teacher1.age = 35;
		Teacher1.qualification = "Msc in CSE";
		Teacher1.displayInformation();

		Student Student1 = new Student();
		Student1.name = "Shakib";
		Student1.age = 39;
		Student1.qualification = "Msc in CSE";
		Student1.displayInformation();

	}

}
