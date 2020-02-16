package my_practice;

public class StringConcatenation {
	
	//'+' - concatenation operator
	//ptintln(ln)-used to print on console for new line
	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		//execution starts from left to right 
	   System.out.println(a+b);
	   System.out.println(x+y);
	   System.out.println(a+b+x+y);
	   System.out.println(x+y+a+b);//***o/p:HelloWorld100200
	   System.out.println(x+y+(a+b));//o/p:HelloWorld300
	
	   System.out.println("the value of a is:"+a);
	   
	   System.out.println("hello selenium");
	   System.out.print("hello selenium");
	   System.out.println("hello selenium");
	   System.out.print("hello selenium");
	   System.out.print("hello selenium");
	}
	

}
