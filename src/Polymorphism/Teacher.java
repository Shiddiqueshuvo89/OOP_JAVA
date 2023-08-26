package Polymorphism;

public class Teacher extends Person {

	@Override
	void displayInformation() {

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Qualification: " + qualification);

	}

}
