package constractor.programing;

public class Camera {
	String color;
	String brand;
	int cost;
	
	
	public Camera(String x,String y,int z) {
		color=x;
		brand=y;
		cost=z;
	}
	void CaptureImage() {
		System.out.println("The camera color is " +color+ " camera name is "+brand+ " cost of camera is"+cost+ "The capturing image......");
	}
	void DisplayImage() {
		System.out.println("The camera color is " +color+ " camera name is "+brand+ " cost of camera is"+cost+ "The displaying image......");
	}

}
