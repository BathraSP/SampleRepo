package superKeyword;

public class SuperVariableChild extends SuperVariableParent {
 
	String name = "Bathra" ; 
	public void println() 
	{  
		System.out.println(super.name);
		System.out.println("name");
	}
			
	public static void main(String[] args) { 
		SuperVariableChild obj = new SuperVariableChild(); 
		obj.println();
		

	}

}
