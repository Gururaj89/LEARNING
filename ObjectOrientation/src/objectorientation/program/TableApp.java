package objectorientation.program;

public class TableApp {

	public static void main(String[] args) {
	
		Table t1=new Table();
		Table t2=new Table();
		t1.seatingcapacity=6;
		t1.cost=2000;
		t1.color="black";
		t1.Brand="greenplay";
		t1.allowToset();
		t1.allowTowrite();
		System.out.println(t1.seatingcapacity+" "+t1.cost+" "+t1.color+" "+t1.Brand);
		t2.seatingcapacity=4;
		t2.cost=3000;
		t2.color="white";
		t2.Brand="greenplay";
		t2.allowToset();
		t2.allowTowrite();
		System.out.println(t2.seatingcapacity+" "+t2.cost+" "+t2.color+" "+t2.Brand);
	}

}
