package Assignment5;


public class Ointment extends Medicine {

	
	void displaylabel() {
		System.out.println("For External Use");

	}

}
class Syrup extends Medicine {

	void displaylabel() {
		System.out.println("May contain Sugar");
	}

}
class Tablet extends Medicine {


	void displaylabel() {
		System.out.println("Store in a cool place");
	}

}