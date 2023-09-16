package objectorientation.program;

public class Fanapp {

	public static void main(String[] args) {
	Fan	f1=new Fan();
	Fan f2=new Fan();
	Fan f3=new Fan();
	f1.no_of_Wings=3;
	f1.color="black";
	f1.cost=25000;
	f1.Brand="anu";
	
	System.out.println(f1.no_of_Wings +" "+f1.cost+" "+f1.color+ " "+f1.Brand);
	
	f1.rotate();
	f1.blow_air();

	f2.no_of_Wings=6;
	f2.color="White";
	f2.cost=5000;
	f2.Brand="usa";
	
	System.out.println(f2.no_of_Wings +" "+f2.cost+" "+f2.color+ " "+f2.Brand);

	f2.rotate();
	f2.blow_air();
	
	f3.no_of_Wings=5;
	f3.color="blue";
	f3.cost=26000;
	f3.Brand="arthi";
	
	
	System.out.println(f3.no_of_Wings +" "+f3.cost+" "+f3.color+ " "+f3.Brand);
    
	f3.rotate();
	f3.blow_air();
	}

}
