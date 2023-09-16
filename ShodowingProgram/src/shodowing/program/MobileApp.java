package shodowing.program;

public class MobileApp {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile("Samsung","Purple",125000);
		System.out.println(mobile1.brand +" "+mobile1.color+" "+mobile1.cost);
        System.out.println("======================================");
		Mobile mobile2=new Mobile("Vivo","Black",25000);
		System.out.println(mobile2.brand +" "+mobile2.color+" "+mobile2.cost);
      
		//mobile1.allowToCall();
		//mobile1.allowToPlay();
	}

}
