package datatypes.program;

public class LongPro {

	public static void main(String[] args) {
    	long a;
	   a= -9223372036854775808L;
       System.out.println(a);
       System.out.println("=================");
    	long b;
	   b= +9223372036854775807L;
       System.out.println(b);
       System.out.println("=================");
     /*long c;
	    c= -9223372036854775809L; //undeflow
	    */
       /*long d;
	    d= +9223372036854775808L; //overflow
	    */
	}

}
