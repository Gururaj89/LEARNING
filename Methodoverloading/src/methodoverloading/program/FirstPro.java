package methodoverloading.program;

public class FirstPro {

	public static void main(String[] args) {
		teabill();
		teabill(5);
		teabill("lemon");
		teabill("coffe",6);

	}

	public static void teabill() {
		System.out.println("Bill for Tea is Only 15Rs");
	}
	public static void teabill(int n) {
		System.out.println("bill for "+n+"teas is " +(n*10));
		
	}
	public static void teabill(String type) {
		System.out.println("bill for " +type+ " tea is 15rs");
	}
	public static void teabill(String type, int n) {
		System.out.println("bill for " +n+" "+type+" tea bill is " +(n*15));
	}
}
