package OOPConcepthPart1;

public class StaticAndNonStaticConcept {

	String name = "Tom";
	static int age = 25;
	
	public static void main(String[] args) {
		
         sum();
         StaticAndNonStaticConcept.sum();
         System.out.println(age);
         
         StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
         obj.sendmail();
         System.out.println(obj.name);
	}
	
	public void sendmail() {
		System.out.println("send mail method");
	}
	
	public static void sum()
	{
		System.out.println("sum method ");
	}

}
