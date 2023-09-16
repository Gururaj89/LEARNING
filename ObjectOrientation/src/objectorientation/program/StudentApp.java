package objectorientation.program;

public class StudentApp {

	public static void main(String[] args) {
	Student	s1=new Student();
	Student	s2=new Student();
	s1.eat();
	s1.study();
	s1.sleep();
	
	s1.id=1;
	s1.name="guru";
	s1.age=26;
	s1.branch="MCA";
	System.out.println("The id number is " + s1.id + " Name is "+s1.name+ " My age is "+ s1.age+" Branch is "+s1.branch);

	s2.eat();
	s2.study();
	s2.sleep();
	
	s2.id=2;
	s2.name="Akshay";
	s2.age=26;
	s2.branch="MCA";
	System.out.println("The id number is " + s2.id + " Name is "+s2.name+ " My age is "+ s2.age+" Branch is "+s2.branch);
	}

}
