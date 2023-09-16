package constractor.programing;

public class CameraApp {

	public static void main(String[] args) {
	Camera c1=new Camera("Black","Sony",55000);
	c1.CaptureImage();
	c1.DisplayImage();
	System.out.println("===========================================================");
	Camera c2=new Camera("White","Nikon",45000);
	c2.CaptureImage();
	c2.DisplayImage();

	}

}
