package my_practice;

public class RuntimePoly {
	public void login()
	{
		System.out.println("old code");
	}
	

}

class B extends RuntimePoly {
	public void login() {
		System.out.println("new login");
	}
	
	public static void main(String[] args) {
		RuntimePoly r = new B();
		r.login();
		
	}
	
}
